static void main(String[] args) {
  def dir = new File('file.txt');
  if(dir.isDirectory()){
    dir.listFiles()
  } else {

  }

  println "Hello world!"
}