pipeline {
    agent any

    tools {
        maven 'Maven39'  // The name you gave Maven in Global Tool Configuration
        jdk 'JDK21'      // The name you gave JDK in Global Tool Configuration
    }

    stages {
        stage('Cloning Code') {
            steps {
                git branch : 'master', url : 'https://github.com/prachi-aster/portfolio_Prachi_Devops.git'
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

