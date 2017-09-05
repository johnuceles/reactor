#!groovy​

node {
   def mvnHome
   stage('Fetch Code') {
      git([url: 'https://github.com/johnuceles/reactor.git', branch: scm.branches[0].name]) 
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
      artifactPath = '/var/lib/jenkins/.m2/repository/com/celestine/johnu/reactor/0.0.1-SNAPSHOT/'
      sh "'${artifactPath}' cf login -a https://api.run.pivotal.io"
      sh "cf push -p reactor-0.0.1-SNAPSHOT.jar reactor"
   }
}
