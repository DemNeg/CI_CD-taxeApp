pipeline{
//Feature branch
agent any;
tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M3"
    }
    stages{
    //Download code from github
        stage 'download_code_github'{
            steps{
                checkout scm
            }
        }
    //Perform maven clean
        stage 'maven_clean'{
            steps{
                sh "mvn clean"
            }
        }
        //Perform maven valide
        stage 'maven_valide'{
            steps{
                sh "mvn valide"
            }
        }
        //Perform maven tests
        stage 'test' {
            steps{
                sh "mvn test"
            }
        }
        //Perform maven package
        stage 'package'{
            steps{
                sh "mvn package"
            }
        }
        //Perform docker build image
        stage 'docker_build'{
            steps{
               sh "docker build -t gousindevops/taxeApp ."
            }
        }
        //Perform tasks on ansible master
       /*  stage 'excuete_ansible'{
            steps{
                exec_ansible();
            }
        } */
    }
    post{
        always{
            message();
        }
    }
}