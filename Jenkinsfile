node('master') {

    stage('checkout')
    {
        git 'https://github.com/falgun2411/mavenjenkinsproject.git'
    }
    stage('verify')
    {
    bat 'mvn verify'
    }
}