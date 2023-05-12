pipeline{

    agent any

    stages {

        stage('Git Checkout'){

            steps{

                script{

                   git branch: 'main', url: 'https://github.com/Bha298/eurikaser1.git'
                }
            }
        }
 
        stage('mvn install'){
            steps{
                script{
                        bat 'mvn clean install'   
                }
            }
        }
       
        
        
    }
}
