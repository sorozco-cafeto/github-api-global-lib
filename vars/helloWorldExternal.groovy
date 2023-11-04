def call(Map config = [:]) {
    com/planetpope/scripts/windows/hello-world.bat
    hello-world.bat "${config.name}" "${config.dayOfWeek}"
}
