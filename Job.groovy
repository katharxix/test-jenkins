String basePath = '/var/jenkins_home/workspace'
String repo = 'git@github.com:katharxix/test-jenkins.git'
String credentialssh = 'PersonalGithub'

    folder ('Job as Code'){
        description ('folder for practice excercises')
        displayName ('Jobs DSL folder')
    }

    pipelineJob('Job as Code/my pipeline'){
        definition{
            cpsScm{
                scm {
                    git("${repo}") 
                }  
            }
        }    
        
    }

    

    