def call(Map config = [:]) {
    loadLinuxScript(name: 'hello-world.bat')
    hello-world.bat "${config.name}" "${config.dayOfWeek}"
}
