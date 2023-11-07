def call(Map config = [:]) {
    loadLinuxScript(name: 'hello-world.bat') 
    echo "hello-world should now work"
}
