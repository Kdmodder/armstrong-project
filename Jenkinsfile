pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Cloning repository...'
                // If using Git:
                // git 'https://github.com/your-repo.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Compiling Java program...'
                sh 'javac ArmstrongNumbers.java'
            }
        }

        stage('Test') {
            steps {
                echo 'Running the program...'
                sh 'java ArmstrongNumbers > output.txt'
            }
        }

        stage('Verify Output') {
            steps {
                echo 'Checking Armstrong numbers...'
                sh 'cat output.txt'
            }
        }
    }

    post {
        success {
            echo 'Pipeline executed successfully!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}
