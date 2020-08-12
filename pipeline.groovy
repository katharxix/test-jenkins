pipeline{
    agent any{
        stages{
            stage('build stage'){
                steps{
                    echo ('build stage')
                }
            stage( 'test')
                steps{
                    echo ('test stage')
                }     
            }
        }
    }
}
