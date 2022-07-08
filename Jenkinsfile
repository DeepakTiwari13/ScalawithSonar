pipeline { 
    agent any  
    stages { 
        stage('Report') { 
            steps {
                     sh 'sbt -Dsonar.host.url=http://172.31.41.72:9000 -Dsonar.login=263a1dcc3fbee8e6e7a7dcda14dca6c6ef1c3351 sonarScan'
                  }
        }
    }
}
