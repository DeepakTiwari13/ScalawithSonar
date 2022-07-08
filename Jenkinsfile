pipeline { 
    agent any  
    stages { 
        stage('Report') { 
            steps {
                     sh 'sbt -Dsonar.host.url=http://172.31.41.72:9000 -Dsonar.login=squ_ff4c935eed8976bf274b96d6c9adcd1fcfe52ac0 sonarScan'
                  }
        }
    }
}
