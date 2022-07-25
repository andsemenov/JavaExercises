package CaesarCode;

import java.io.*;


public class Main {
    static String INPUT_TEXT = "inputText.txt", CODED_TEXT = "codedText.txt", DECODED_TEXT = "decodedText.txt";
    static int KEY = 3;

    public static void main(String[] args) throws IOException {
        readWriteInFileWithKey(INPUT_TEXT, CODED_TEXT, KEY);
        readWriteInFileWithKey(CODED_TEXT, DECODED_TEXT, -KEY);
        System.out.println("Result of bruteforce is " + bruteForce(CODED_TEXT));
    }
    static void readWriteInFileWithKey(String file1, String file2, int key) {
        try {
            FileReader fr = new FileReader(file1);
            FileWriter fw = new FileWriter(file2);
            int i;
            while ((i = fr.read()) != -1) {
                fw.write((char) (i + key));
            }
            fr.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("There are some IOException");
        }
    }
    static int bruteForce(String file) {
        int keyMax = 0;
        try {
            RandomAccessFile fr = new RandomAccessFile(file, "r");
            int i;
            int counter;
            int key = 0, counterMax = 0;
            boolean isNotEnd = true;
            while (isNotEnd) {
                counter = 0;
                key++;
                while ((i = fr.read()) != -1) {

                    if ((i - key) >= 0) {
                        if ((char) (i - key) == ' ') {
                            counter++;
                        }
                    } else {
                        isNotEnd = false;
                        break;
                    }
                }
                if (counter >= counterMax) {
                    counterMax = counter;
                    keyMax = key;
                }
                fr.seek(0);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("There are some IOException");
        }
        return keyMax;
    }
}


