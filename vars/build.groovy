<<<<<<< HEAD
def call(String mavenGoal){
  
  if ("${mavenGoal}" == "Clean")
     {
       sh "mvn clean"
     }
  else if ("${mavenGoal}" == "Compile")
     {
       sh "mvn clean compile"
     }
  else if ("${mavenGoal}" == "Test")
     {
       sh "mvn clean test"
     }
   else if ("${mavenGoal}" == "Package")
      {
        sh "mvn clean package"
     }
}
=======
def call(String mavenGoal){
  
  if ("${mavenGoal}" == "Clean")
     {
       sh "mvn clean"
     }
  else if ("${mavenGoal}" == "Compile")
     {
       sh "mvn clean compile"
     }
  else if ("${mavenGoal}" == "Test")
     {
       sh "mvn clean test"
     }
   else if ("${mavenGoal}" == "Package")
      {
        sh "mvn clean package"
     }
}
>>>>>>> d1ba5638c2a2b6fdfdc0096d649b5f4f4c2ee3a1
