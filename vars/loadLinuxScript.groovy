def call(Map config = [:]) { 
  def scriptcontents = libraryResource "com/planetpope/scripts/windows/${config.name}"    
  writeFile file: "${config.name}", text: scriptcontents 
  attrib +x ${config.name}.bat
  echo "echo from inside loadLinuxScript the variable : ${config.name}"
} 
