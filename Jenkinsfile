pipeline {
    agent {docker:  'gradle:jdk9'}
    tools {
        maven 'apache-maven-3.0.1'
    }
    stages {
        stage('gradle-version') {
            steps {
                sh 'gradle --version'
            }
        }
    }
}