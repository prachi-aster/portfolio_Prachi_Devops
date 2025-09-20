pipeline {
    agent any

    stages {
        stage('Cloning Code') {
            steps {
                git branch: 'master', url: 'https://github.com/prachi-aster/portfolio_Prachi_Devops.git'
            }
        }

        stage('Build') {
            steps {
                // Windows Maven build
                bat 'mvn clean compile'
                echo 'Build successful'
            }
        }

        stage('Run') {
            steps {
                // Start Spring Boot in background on Windows
                bat 'start /B mvn spring-boot:run'
                echo 'Application started in background'
            }
        }
    }
}
