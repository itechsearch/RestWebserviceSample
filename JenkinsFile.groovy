node {
    stage('Configure') {
        env.PATH = "${tool 'maven-3.5.2'}/bin;${env.PATH}"
        echo env.PATH
        version = '1.0.' + env.BUILD_NUMBER
        currentBuild.displayName = version

        properties([buildDiscarder(logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '', numToKeepStr: '10')), disableConcurrentBuilds(), [$class: 'GithubProjectProperty', displayName: '', projectUrlStr: 'https://github.com/itechsearch/RestWebserviceSample/'], pipelineTriggers([githubPush()])])

    }

    stage('Checkout') {
        git 'https://github.com/itechsearch/RestWebserviceSample'
    }

    stage('Version') {
        bat "mvn -B -V -U -e versions:set -DnewVersion=$version"
    }

    stage('Build') {
        bat 'mvn -B -V -U -e clean package'
    }

    stage('Archive') {
        junit allowEmptyResults: true, testResults: '**/target/**/TEST*.xml'
    }

    stage('Deploy') {
        // Depends on the 'Credentials Binding Plugin'
        // (https://wiki.jenkins-ci.org/display/JENKINS/Credentials+Binding+Plugin)

        pushToCloudFoundry cloudSpace: 'ITechSearch', credentialsId: 'pivotalcf', organization: 'ITechSearch', target: 'https://api.run.pivotal.io'


    }
}