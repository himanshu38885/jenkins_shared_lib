def call(){
    sh 'printenv | sort'
    sh 'chmod +x jfrog.py'
    sh './jfrog.py'
}
