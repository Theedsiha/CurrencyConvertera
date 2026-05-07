pipeline {

    agent any

    tools {
        maven 'Maven'
        jdk 'JDK'
    }

    stages {

        stage('Clone Repository') {
            steps {
                git 'https://github.com/USERNAME/CurrencyConverter.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }
    }

    post {

        success {
            echo 'Build Successful'
        }

        failure {
            echo 'Build Failed'
        }
    }
}