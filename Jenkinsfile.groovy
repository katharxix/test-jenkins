String basePath = '/var/jenkins_home/workspace'
String repo = 'git@github.com:katharxix/test-jenkins.git'
String credentialssh = 'PersonalGithub'

    folder ('Job as Code'){
        description ('folder for practice excercises')
        displayName ('Jobs DSL folder')
    }

    job('Job as Code/my pipeline'){
        scm {
            git{
               remote{
                   url ("${repo}")
                   credentials ("${credentialssh}")
               }   
            branches ("master")
            }
        }
        
    }

    

    