pipelineJob('ManuFileProcessing') {
    description('A pipeline job that runs a Jenkinsfile and processes the uploaded file.')

    parameters {
        fileParam('manufile', 'Upload a file to be processed')  // File parameter
    }

    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/manusmtp/jenmanu.git')  // Your Git repository URL
                    }
                    branches('*/main')  // Corrected to "branches"
                }
            }
            scriptPath('Jenkinsfile')  // Path to Jenkinsfile in the repository
        }
    }
}
