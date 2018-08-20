pipeline {
    agent any 
      
    stages { 	

		stage('Teste Funcional') { 
			steps {				
				echo "Executando Teste Funcional"
				sh "docker run --rm -v /opt/jenkins/workspace/teste_funcional_app:/codigo_teste_com_selenium_webdriver -e 'MVN_OPTS=-Dtest=testPaginaPrincipal surefire-report:report' renatoadsumus/chrome_standart:latest"
			}			
		}
		        
    }
	
	//post {
		//always {
		//cleanWs()
		//}
	//}
 }