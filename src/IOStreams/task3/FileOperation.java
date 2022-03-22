package IOStreams.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
public class FileOperation {

    public void  writeInFile(ArrayList <Integer> arrayList, String path) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter(new FileOutputStream(new File(path)));
        for (Integer number : arrayList) {
            printWriter.println (number);
        }
        printWriter.close ();
    }
    public void copySortNumbers() throws FileNotFoundException {
        ArrayList<Integer> numbers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("file1.txt"))) {
            while (br.ready()) {
                numbers.add(Integer.parseInt( br.readLine()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(numbers);
        writeInFile(numbers, "file2.txt");
    }
    }
