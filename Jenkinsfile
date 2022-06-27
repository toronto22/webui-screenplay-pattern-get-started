pipeline {
    agent any

    tools{
        maven 'maven'
    }

    stages {

        stage('Tests') {
            steps {
                bat 'mvn clean install'
                junit '**/target/surefire-reports/*.xml'
            }
        }
    }
}
