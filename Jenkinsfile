#!groovy​

node {
   def mvnHome
   stage('Fetch Code') {
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
   stage('Deploy') {
      //add deployment steps here
   }
}
