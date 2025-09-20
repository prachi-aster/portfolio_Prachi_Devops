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
                bat "mvn clean compile"
                echo "Build successful"
            }
        }

        stage('Run') {
            steps {
                bat "mvn spring-boot:run"
                echo "Application is up and running"
            }
        }
    }
}
