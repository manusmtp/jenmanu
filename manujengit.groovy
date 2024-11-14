job('FileProcessingJob') {
    description('A job that uploads a file to the workspace and executes a script using that file.')

    parameters {
    parameters {
        fileParam('manufile', 'Upload a file to be processed')  // Use the correct method signature
        }
    }

    steps {
        shell('''
            # Define the file path
            FILE_PATH="$WORKSPACE/manufile"

            # Check if the file exists in the workspace
            if [ -f "$FILE_PATH" ]
            then
                echo "File $FILE_PATH has been uploaded to the workspace."

                # Display the contents of the file (optional)
                echo "Contents of $manufile:"
                cat "$FILE_PATH"

            else
                echo "File $FILE_PATH not found in the workspace!"
            fi
        ''')
    }
}
