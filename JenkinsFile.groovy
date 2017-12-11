stage 'build'
node {
    git 'https://github.com/itechsearch/RestWebserviceSample' withEnv(["PATH+MAVEN=${tool 'm3'}/bin"]) {
        bat "mvn -B –Dmaven.test.failure.ignore=true clean package"
    }
    stash excludes: 'target/', includes: '**', name: 'source'
}
stage 'test'
parallel 'integration': {
    node {
        unstash 'source' withEnv(["PATH+MAVEN=${tool 'm3'}/bin"]) {
            bat "mvn clean verify"
        }
    }
}, 'quality': {
    node {
        unstash 'source' withEnv(["PATH+MAVEN=${tool 'm3'}/bin"]) {
            bat "mvn sonar:sonar"
        }
    }
}
stage 'approve'
timeout(time: 3, unit: 'DAYS') {
    input message: 'Do you want to deploy?', submitter: 'ops'
}
