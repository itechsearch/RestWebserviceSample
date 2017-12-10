note('java8'){
    stage('Configure'){
        env.PATH="${tool 'maven-3.5.2'}/bin:${env.PATH}"
    }
    stage('Checkout'){
        git "https://github.com/itechsearch/RestWebserviceSample"
    }
    stage('Build'){
        bat 'mvn -B -V -U -e clean package'
    }
    stage('Archive'){
        junit allowEmptyResults: true, testResults:'**/target/**/TEST*.xml'

    }
}