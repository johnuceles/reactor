#!groovy​

node {
   def mvnHome
   stage('Fetch Code') {
      git([url: 'https://github.com/johnuceles/reactor.git', branch: 'develop']) 
      mvnHome = tool 'M3'
   }
   stage('Unit and Integration Tests') {
      sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore verify"
   }
   stage('Build') {
      sh "'${mvnHome}/bin/mvn' clean install -DskipTests"
   }
   stage('Reports') {
      junit '**/target/surefire-reports/TEST-*.xml'
      archive 'target/*.jar'
   }
}