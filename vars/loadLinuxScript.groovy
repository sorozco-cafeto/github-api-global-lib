def call(Map config = [:]) { 
  def scriptcontents = libraryResource "com/planetpope/scripts/windows/${config.name}"    
  writeFile file: "${config.name}", text: scriptcontents 
  echo "echo from inside loadLinuxScript the variable config.name: ${config.name} "
  echo "echo from inside loadLinuxScript the second variable scriptcontents: ${scriptcontents}"
  //attrib +x ./${config.name}
} 
