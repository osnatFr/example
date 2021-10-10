pipeline{
	
	agent none
	 stages{
		   stage('mvn') {
				agent { node { label 'master' } }
				steps {  
			           dir("C:/workspace/leumitask"){
							script{				
									bat "./mvnw spring-boot:run"
							}
			  		   }
			     
			 	}
			
		
		  }
	
	}
}