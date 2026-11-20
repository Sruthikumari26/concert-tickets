pipeline {
    agent { node { label 'prod' } }
    tools { maven 'mymaven' }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Sruthikumari26/concert-tix.git'
            }
        }
        
        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }
        
        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('mysonar') {
                    sh 'mvn sonar:sonar'
                }
            }
        }
        
        stage('Quality Gate') {
            steps {
                timeout(time: 1, unit: 'HOURS') {
                    waitForQualityGate abortPipeline: true
                }
            }
        }
        
        stage('Docker Build & Deploy') {
            steps {
                // Build and start the container
                sh 'docker compose down || true'
                sh 'docker compose up -d --build'
            }
        }
    }
}
