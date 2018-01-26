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
            app = docker.build("aardelean/jenkins-small")
        }

        stage('Push image') {
            docker.withRegistry('https://registry.hub.docker.com', 'my user and pass') {
                app.push("${env.BUILD_NUMBER}")
                app.push("latest")
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}