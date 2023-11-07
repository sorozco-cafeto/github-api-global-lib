def call(Map config = [:]) { 
  def scriptcontents = libraryResource "com/planetpope/scripts/windows/${config.name}"    
  writeFile file: "${config.name}", text: scriptcontents 
  attrib a+x ./${config.name}
    sh "chmod a+x ./${config.name}"
  echo "echo from inside loadLinuxScript the variable : ${config.name}"
} 
