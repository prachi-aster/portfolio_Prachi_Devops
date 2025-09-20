pipeline {
    agent any

    //tools {
       // maven 'Maven3'  // The name you gave in Global Tool Configuration
   // }

    stages {
        stage('Cloning Code') {
            steps {
                //git branch: 'master', url: 'https://github.com/prachi-aster/portfolio_Prachi_Devops.git'
                echo "I am here"
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
                echo 'Build successful'
            }
        }

        stage('Run') {
            steps {
                sh 'mvn spring-boot:run'
            }
        }
    }
}
