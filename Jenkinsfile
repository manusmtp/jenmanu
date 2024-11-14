@Library('manusharedjenkins@main') _  // Specify the library version or branch if required

pipeline {
    agent any

    stages {
        stage('Process File') {
            steps {
                script {
                    // Access the uploaded file directly in the workspace
                    def filePath = "${workspace}/${params.manufile}"
                    echo "Reading file from: ${filePath}"

                    // Check if the file exists and process it
                    if (fileExists(filePath)) {
                        def fileContent = readFile(filePath)
                        echo "File contents:\n${fileContent}"
                    } else {
                        error "File ${filePath} does not exist!"
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
