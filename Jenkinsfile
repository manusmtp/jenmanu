@Library('manusharedjenkins@main') _  // Specify the library version or branch if required

pipeline {
    agent any

   environment { 
    FILE_PATH = "${env.WORKSPACE}/params.manufile"
     }

    stages {
        stage('Process File') {
            steps {
                script {
                    // Define and access the uploaded file in the workspace
                    if (params.TEST_FILE) 
                    { 
                        sh "cp ${params.TEST_FILE} ${FILE_PATH}" 
                        echo "File uploaded to: ${FILE_PATH}" 
                    }
                    else 
                    { 
                        error "No file uploaded." 
                    }
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
