@Library('manusharedjenkins@main') _  // Specify the library version or branch if required

pipeline {
    agent any
    stages {
        stage('Process File') {
            steps {
               script { 
                def fileName = params.manufile 
                sh "cat ${fileName}" // Print the contents of the uploaded file using Unix shell }
                }
            }
        }
        stage('Calling Shared Library') {
                        steps {
                            script {
                                // Call the shared library function
                                call6("manuprasad")
                            }
                        }
                    }
        }
            
}
