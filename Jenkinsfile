@Library('manusharedjenkins@main') _  // Specify the library version or branch if required

pipeline {
    agent any

    stages {
        stage('Process File') {
            steps {
                script {
                    // Access the uploaded file directly in the workspace
                    sh """
                    filePath="${WORKSPACE}/manufile"
                    echo "Reading file from: ${filePath}"

                    # Check if the file exists
                    if [ -f "${filePath}" ]; then
                        # Read the file content and display it
                        fileContent=\$(cat "${filePath}")
                        echo "File contents: \${fileContent}"
                    else
                        echo "Error: File ${filePath} does not exist!"
                        exit 1  # Exit with error code
                    fi
                    """
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
