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
        bat "mvn clean compile"
      echo "build successful"
      }
    }
    stage("deploy")
    {
      steps{
        bat "mvn install"
      echo "application is up and running"
      }
    }
  }
}


