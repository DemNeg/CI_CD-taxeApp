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
                download_code_github();
            }
        }
    //Perform maven clean
        stage 'maven_clean'{
            steps{
                clean();
            }
        }
        //Perform maven valide
        stage 'maven_valide'{
            steps{
                valide();
            }
        }
        //Perform maven tests
        stage 'test' {
            steps{
                test();
            }
        }
        //Perform maven package
        stage 'package'{
            steps{
                maven_package();
            }
        }
        //Perform docker build image
        stage 'docker_build'{
            steps{
                docker_build();
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
    //Fonction definition for downloading code from github
    def download_code_github(){
        checkout scm
    }
    //Function definition to perform maven clean
    def clean(){
        sh "mvn clean"
    }
    //Function definition to perform maven valide
    def valide(){
        sh "mvn valide"
    }
    //Function definition to perform maven test
    def test(){
        sh "mvn test"
    }
    //Function definition to perform maven package
    def maven_package(){
        sh "mvn package"
    }
    //Function definition to perform docker build image
    def docker_build(){
        sh "docker build -t gousindevops/taxeApp ."
    }
}
