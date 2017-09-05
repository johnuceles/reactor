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
   stage('Deploy to QA') {
      pushToCloudFoundry(
    target: 'api.run.pivotal.io',
    organization: 'Reactor',
    cloudSpace: 'QA',
    credentialsId: 'pcf'
   )
   }
   stage('Deploy to Dev') {
      pushToCloudFoundry(
    target: 'api.run.pivotal.io',
    organization: 'Reactor',
    cloudSpace: 'Development',
    credentialsId: 'pcf'
   )
   }
}
