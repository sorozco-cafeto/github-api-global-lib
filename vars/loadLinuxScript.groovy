def call(Map config = [:]) { 
  def scriptcontents = libraryResource "com/planetpope/scripts/windows/${config.name}"    
  writeFile file: "${config.name}", text: scriptcontents 
  echo "echo from inside loadLinuxScript the variable : ${config.name} and ${scriptcontents}"
  scriptcontents 
  attrib +x ${config.name}
} 
