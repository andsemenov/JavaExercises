package IOStreams.task1;

public class Main {
    static String SRC = "/home/coder/Desktop/1111/log1.txt";
    static String DEST = "/home/coder/Desktop/1111/log2.txt";

    public static void main(String[] args) {

FileCopy fileCopy = new FileCopy(SRC, DEST);
        long timeBefore=System.nanoTime();
        fileCopy.copyFileFileReaderWriter();
       long timeAfter = System.nanoTime();
        System.out.println("Time without buffer"+ (timeAfter - timeBefore));
        long timeBeforeBuffered=System.nanoTime();
        fileCopy.copyFileBufferedReaderBufferedWriter();
        long timeAfterBuffered=System.nanoTime();
        System.out.println("Time with buffer"+ (timeAfterBuffered - timeBeforeBuffered));
    }
}

//Задача 1.
//Написать класс, который копирует содержимое из одного файла в другой. В нем создать два метода: первый
// - копирует использую только FileReader и FileWriter, второй - копирует используя классы BufferedReader, FileReader,
// BufferedWriter, FileWriter.
//С помощью System.currentTimeMillis() посмотреть, какой из методов отработает быстрее (файл из которого копируется
// информация в обоих случаях должен быть один и тот же).