pipeline{
agent any
tools{
    maven 'maven 3.8.6'
    jdk 'JDK 11'
 }
  stages{
    stage('test')
    {
      steps{
        sh'''#!bin/bash
        mvn clean test
        '''
      }
    }
  }
}
