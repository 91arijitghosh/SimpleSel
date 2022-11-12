pipeline{
agent any
  stages{
    stage('test')
    {
      steps{
        sh'''#!bin/bash
        echo "PATH = ${PATH}"
        echo "M2_HOME = ${M2_HOME}"
        mvn clean test
        '''
      }
    }
  }
}
