pipeline {
    agent {
        docker{
            image   'gradle:4.4.1-jdk9'
        }
    }

    stages {
        stage('Build') {
            steps {
                echo './gradlew build'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}