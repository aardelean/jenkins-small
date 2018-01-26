pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh './gradlew build'
            }
        }
        stage('Test') {
            steps {
                sh './gradlew check'
            }
        }
        stage('Build image') {
            steps {
                app = docker.build("aardelean/jenkins-small")
            }
        }

        stage('Push image') {
            steps {
                docker.withRegistry('https://registry.hub.docker.com', 'jenkins-docker') {
                    app.push("${env.BUILD_NUMBER}")
                    app.push("latest")
                    }
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}