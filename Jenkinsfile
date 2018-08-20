pipeline {
    agent any 
      
    stages { 	

		stage('Teste Funcional') { 
			steps {		
				
				slackSend (color: '#FFFF00', message: "STARTED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' (${env.BUILD_URL})")

               	hipchatSend (color: 'YELLOW', notify: true,
            	message: "STARTED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' (${env.BUILD_URL})"
          		)		

				echo "Executando Teste Funcional"
				sh "docker run --rm -v /opt/jenkins/workspace/teste_funcional_app:/codigo_teste_com_selenium_webdriver -e 'MVN_OPTS=-Dtest=testPaginaPrincipal surefire-report:report' renatoadsumus/chrome_standart:latest"
			}			
		}
		        
    }
	
	post {
		success {
      slackSend (color: '#00FF00', message: "SUCCESSFUL: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' (${env.BUILD_URL})")

      hipchatSend (color: 'GREEN', notify: true,
          message: "SUCCESSFUL: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' (${env.BUILD_URL})"
        )

  
    }
	
	failure {
      slackSend (color: '#FF0000', message: "FAILED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' (${env.BUILD_URL})")

      hipchatSend (color: 'RED', notify: true,
          message: "FAILED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' (${env.BUILD_URL})"
        )     
    }
	}
 }