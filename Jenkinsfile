pipeline {
    agent any

    echo "test"

    tools {
        maven 'Maven3'  // The name you gave in Global Tool Configuration
    }

    stages {
        stage('Cloning Code') {
            steps {
                //git branch: 'master', url: 'https://github.com/prachi-aster/portfolio_Prachi_Devops.git'
                echo "I am here"
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
                echo 'Build successful'
            }
        }

        stage('Run') {
            steps {
                bat 'mvn spring-boot:run'
            }
        }
    }
}
