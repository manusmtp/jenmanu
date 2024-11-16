job('example-job-with-three-active-choice-parameters') {
    parameters {
        activeChoiceParam('CHOICE_PARAM_1') {
            description('Select an option for Parameter 1')
            filterable()
            choiceType('SINGLE_SELECT')
            groovyScript {
                script('["Option 1", "Option 2", "Option 3"]')
                fallbackScript('return ["ERROR"]')
            }
        }
        activeChoiceReactiveParam('CHOICE_PARAM_2') {
            description('Reactive Parameter 2')
            filterable()
            choiceType('SINGLE_SELECT')
            groovyScript {
                script('''
                    if (CHOICE_PARAM_1.equals("Option 1")) {
                        return ["Option A1", "Option A2"]
                    } else if (CHOICE_PARAM_1.equals("Option 2")) {
                        return ["Option B1", "Option B2"]
                    } else {
                        return ["Option C1", "Option C2"]
                    }
                ''')
                fallbackScript('return ["ERROR"]')
            }
            referencedParameter('CHOICE_PARAM_1')
        }
        activeChoiceReactiveParam('CHOICE_PARAM_3') {
            description('Reactive Parameter 3')
            filterable()
            choiceType('SINGLE_SELECT')
            groovyScript {
                script('''
                    if (CHOICE_PARAM_1.equals("Option 1")) {
                        return ["Option X1", "Option X2"]
                    } else if (CHOICE_PARAM_1.equals("Option 2")) {
                        return ["Option Y1", "Option Y2"]
                    } else {
                        return ["Option Z1", "Option Z2"]
                    }
                ''')
                fallbackScript('return ["ERROR"]')
            }
            referencedParameter('CHOICE_PARAM_1', 'CHOICE_PARAM_2')
        }
    }
   
}
