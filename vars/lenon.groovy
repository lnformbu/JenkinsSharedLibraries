<<<<<<< HEAD
def call(String stageName){
  
  if ("${stageName}" == "Build")
     {
       sh "mvn clean package"
     }
  else if ("${stageName}" == "SonarQube Report")
     {
       sh "mvn clean sonar:sonar"
     }
  else if ("${stageName}" == "Upload Into Nexus")
     {
       sh "mvn clean deploy"
     }
  else if ("${stageName}" == "Continious Delivery")
     timeout(time: 48, unit: 'HOURS'){
        // some block
        input message: 'Approve or Decline'
     }
  else if ("${stageName}" == "Deployment")
     {
       deploy adapters: [tomcat9(credentialsId: 'tomcat', path: '', url: 'http://54.91.68.158:8080/')], contextPath: null, war: 'target/*war'
     }
}
