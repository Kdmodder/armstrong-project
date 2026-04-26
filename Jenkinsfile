pipeline {
    agent any

    environment {
        OUTPUT_FILE = "output.txt"
    }

    stages {

        stage('Checkout') {
            steps {
                echo 'Cloning repository...'
                git 'https://github.com/Kdmodder/armstrong-project'
            }
        }

        stage('Build') {
            steps {
                echo 'Compiling Java program...'
                sh 'javac ArmstrongNumbers.java'
            }
        }

        stage('Run') {
            steps {
                echo 'Running program...'
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

            // ✅ Save output as artifact
            archiveArtifacts artifacts: 'output.txt', fingerprint: true
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}
