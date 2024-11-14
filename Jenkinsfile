@Library('manusharedjenkins') _

pipeline {
    agent any
    stages {
        stage('Process File') {
            steps {
                script {
                    // Access the uploaded file in the workspace
                    def filePath = "${env.WORKSPACE}/${params.manufile}"
                    echo "Reading file: ${filePath}"
                    if (fileExists(filePath)) {
                        // Read and process the file
                        def fileContent = readFile(filePath)
                        echo "File contents: ${fileContent}"
                    } else {
                        error "File ${filePath} does not exist!"
                    }
                    // Call the shared library function
                    call6("manuprasad")
                }
            }
        }
    }
}
