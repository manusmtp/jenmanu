pipelineJob('FileProcessingPipelineJob') {
    description('A pipeline job that processes the uploaded file.')

    parameters {
        fileParam('manufile', 'Upload a file to be processed')
    }

    definition {
        cps {
            script("""
            @Library('manusharedjenkins') _
                pipeline {
                    agent any
                    parameters {
                        file(name: 'manufile', description: 'Upload a file to be processed')
                    }
                    stages {
                        stage('Process File') {
                            steps {
                                script {
                                    // Access the file uploaded in the workspace
                                    def filePath = "${WORKSPACE}/manufile"
                                    echo "Reading file: ${filePath}"
                                    if (fileExists(filePath)) {
                                        // Read and process the file
                                        def fileContent = readFile(filePath)
                                        echo "File contents: ${fileContent}"
                                    } else {
                                        error "File ${filePath} does not exist!"
                                    }
                                }
                            }
                        }
                    }
                }
            """)
        }
    }
}
