pipeline{
  
  agent any
  
  environment{
   PATH=$PATH:$MAVEN_HOME/bin 
  }
  
  stages{
    stage('Build')
    {
      steps{
        echo "This is building Stage"
      }
    }  
    stage('Test')
    {
      steps{
        sh'''#!/bin/bash
        echo "This is testing Stage"
        mvn clean test 
        '''
      }
    }  
    stage('Deploy')
    {
      steps{
        echo "This is deployment Stage"
      }
    }  
  }
}
