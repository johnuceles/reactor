#!groovy​

node {
   def mvnHome
   stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
      git([url: 'https://github.com/johnuceles/reactor.git', branch: 'develop'])
      // Get the Maven tool.       
      mvnHome = tool 'M3'
   }
   stage('Build') {
      // Run the maven build
      sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean install"
   }
   stage('Results') {
      junit '**/target/surefire-reports/TEST-*.xml'
      archive 'target/*.jar'
   }
}