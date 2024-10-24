import java.nio.file.Paths;
static void main(String[] args) throws IOException {
    //Создаем переменную для исходного каталога

    String d = '/tmp/1'
    def dir = new File(d)
    println("Directory Exists = " +  isDirectoryExists(d));

    if (!isDirectoryExists(d)) {
        println(dir.createParentDirectories().mkdir())
        println("Directory was created " + dir.getName())
    }

    //Создаем переменную для счетчика каталогов
    def countFiles = 0
    //Создаем переменную для счетчика файлов
    def countDirectories = 0
    if (dir.isDirectory()) {
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


static boolean isDirectoryExists(String directoryPath){
    if (!Paths.get(directoryPath).toFile().isDirectory())
    {
        return false;
    }
    return true;
}