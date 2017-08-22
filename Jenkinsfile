#!groovy​

node {
   def mvnHome
   stage('Fetch Code') {
      git([url: 'https://github.com/johnuceles/reactor.git', branch: 'feature/base_structure']) 
      mvnHome = tool 'M3'
   }
   stage('Run Tests') {
      sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore verify"
   }
   stage('Generate Reports') {
      junit '**/target/surefire-reports/TEST-*.xml'
      archive 'target/*.jar'
   }
   stage('Build') {
      sh "'${mvnHome}/bin/mvn' install -DskipTests"
   }
}