#!groovy​

node {
   def mvnHome
   stage('Fetch Code') {
      git([url: 'https://github.com/johnuceles/reactor.git', branch: 'develop']) 
      mvnHome = tool 'M3'
   }
   stage('Unit Tests') {
      sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean install"
   }
   //stage('Integration Tests') {
   //   sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore verify"
   //}
   stage('Results') {
      junit '**/target/surefire-reports/TEST-*.xml'
      archive 'target/*.jar'
   }
}