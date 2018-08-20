pipeline {
    agent any 
      
    stages { 	

		stage('Teste Funcional') { 
			steps {				
				echo "Building aplicacao com Gradle"
				sh "docker run -it -v /opt/jenkins/workspace/teste_funcional_app:/codigo_teste_com_selenium_webdriver -e 'MVN_OPTS=-Dtest=testPaginaPrincipal' renatoadsumus/chrome_standart:latest /bin/bash"
			}			
		}
		        
    }
	
	//post {
		//always {
		//cleanWs()
		//}
	//}
 }