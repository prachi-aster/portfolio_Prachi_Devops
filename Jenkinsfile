pipeline{
  agent any;
  stages{
    stage("cloning code")
    {
      steps{
        git url : "https://github.com/prachi-aster/portfolio_Prachi_Devops.git" , branch : "master"
      }
    }
    stage("build")
    {
      steps{
        bat "mvn clean install"
      echo "build successful"
      }
    }
    stage("run")
    {
      steps{
        bat "mvn spring-boot:run"
      echo "application is up and running"
      }
    }
  }
}

