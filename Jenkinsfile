pipeline{
  agent any
  parameters{
    choice(name: 'Version', choices['1.1', '1.2', '1.3'], description: '')
    booleanParam(name: 'executeTest', defaultValue: true, description: '')
  }
  environment{
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
      when{
        expression{params.executeTest}
      }
      steps{
        echo 'Testing the application...'
      }
    }
    stage("deploy"){
      steps{
        echo 'Deploying the application...'
        echo "Deploying with ${SERVER_CREDENTIALS}"
        echo "Deploying version ${params.Version}"
      }
    }
  }
}
