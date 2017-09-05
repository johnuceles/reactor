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
      println 'Step 1 - sleeping'
      System.getProperty("user.dir");
      sleep(30)
      println 'Step 2 - navigating to directory'
      artifactPath = '/var/lib/jenkins/.m2/repository/com/celestine/johnu/reactor/0.0.1-SNAPSHOT/'
      System.getProperty("user.dir");
      sleep(30)
      println 'Step 3 - logging in'
      sh "'${artifactPath}' cf login -a https://api.run.pivotal.io"
      System.getProperty("user.dir");
      sleep(30)
      println 'Step 4 - pushing'
      System.getProperty("user.dir");
      sh "cf push -p reactor-0.0.1-SNAPSHOT.jar reactor"
   }
}
