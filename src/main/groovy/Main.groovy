static void main(String[] args) {
  //Создаем переменную для исходного каталога
  def dir = new File('/tmp/1')
  //Создаем переменную для счетчика каталогов
  def countFiles = 0
  //Создаем переменную для счетчика файлов
  def countDirectories = 0

  if (dir.isDirectory()){
    for (File item : dir.listFiles()) {
      if (item.isDirectory()) {
        //println "The directories name is " + item.getName()
        countDirectories = countDirectories + 1
      } else {
        //println "The file name is " + item.getName()
        countFiles = countFiles + 1
      }
    }
  }
  println("The directories " + countDirectories)
  println("The files " + countFiles)
}