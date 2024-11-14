@Library('manusharedjenkins@main') _  // Specify the library version or branch if required

pipeline{
    agent any
    stages {
        stage('Process File') {
            steps {
                script {
                    // Access the uploaded file in the workspace
                 def filePath = "${env.WORKSPACE}/${params.manufile}"
                echo "Reading file from: ${filePath}"

                if (fileExists(filePath)) {
                        def fileContent = readFile(filePath)
                        echo "File contents: ${fileContent}"
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
