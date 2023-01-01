pipeline{
  
  agent  {
    docker {
            image 'maven:3.8.1-adoptopenjdk-11'
            args '-v $HOME/.m2:/root/.m2'
           }
   }
  environment{
   PATH="$PATH:$MAVEN_HOME/bin" 
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
