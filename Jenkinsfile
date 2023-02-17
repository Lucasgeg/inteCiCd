pipeline {
    agent any

 

    tools {
        jdk "jdk11"
    }

 

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/Lucasgeg/inteCiCd'

 

                sh "./gradlew clean test"

 

            }

 

            
        }
    }
}
