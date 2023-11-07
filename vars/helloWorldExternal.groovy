def call(Map config = [:]) {
    loadLinuxScript(name: 'hello-world.bat') 
    echo "echo before running the bat file"
    dir
    ./hello-world.bat '${config.name} ' '${config.dayOfWeek} '
    echo "hello-world should now work"
}
