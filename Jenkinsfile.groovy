String basePath = '/var/jenkins_home/workspace'
String repo = 'git@github.com:katharxix/test-jenkins.git'
String credentialssh = 'PersonalGithub'

    folder {basePath} {
        description ('folder for practice excercises')
        displayName ('Jobs DSL folder')
        configure { folder -> folder / icon (class: 'localhost:8080.MyFolderIcon')}
    }

pipelineJob('Job as Code'){
    job("${basePath}/example-build') 
    scm {
        git{
            remote{
                url ("${repo}")
                credentials ("${credentialssh}")
            branches ("master")
            }
        }
    }
    
}
    sandbox(boolean sandbox = true)
credentials('String credentialsgithub')


    