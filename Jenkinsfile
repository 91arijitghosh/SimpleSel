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
        echo "PATH = ${PATH}"
        echo "M2_HOME = ${M2_HOME}"
        mvn clean test
        '''
      }
    }
  }
}
