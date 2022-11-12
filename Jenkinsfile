pipeline{
  agent any
  stages{
    stage('test')
    {
      steps{
        sh'''#!bin/bash
        echo "Hello World"
        mvn clean test
        '''
      }
    }
  }
}
