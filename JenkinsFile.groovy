note('java8'){
    stage('Configure'){
        env.PATH="${tool 'maven-3.5.2'}/bin:${env.PATH}"
    }
    stage('Checkout'){
        git ""
    }

}