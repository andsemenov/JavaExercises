package IOStreams.task3;

import java.io.FileNotFoundException;



public class Main {
    public static void main(String[] args) throws FileNotFoundException {
      FileOperation fileOperation = new FileOperation();
      fileOperation.writeInFile(Input.createList(), "file1.txt");
      fileOperation.copySortNumbers();
    }
    }


//Задча 3.
//Создать и заполнить файл только целыми числами с клавиатуры(не дать пользователю ввести что-либо другое).
//Считать информацию из этого файла, отсортировать числа по возрастанию и записать их в другой файл.