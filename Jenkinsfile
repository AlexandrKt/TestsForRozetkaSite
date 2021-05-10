pipeline{
  agent any
  enviroment{
    NEW_VERSION = '1.0'
    SERVER_CREDENTIALS=credentials('server-credentials')
  }
  stages{
    stage("build"){
      steps{
        echo 'Building the application...'
        echo "Building version ${NEW_VERSION}"
      }
    }
    stage("test"){
      steps{
        echo 'Testing the application...'
      }
    }
    stage("deploy"){
      steps{
        echo 'Deploying the application...'
        echo "Deploying with ${SERVER_CREDENTIALS}"
      }
    }
  }
}
