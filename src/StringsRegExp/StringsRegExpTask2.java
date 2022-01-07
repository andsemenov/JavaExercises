package StringsRegExp;

import java.util.Arrays;

public class StringsRegExpTask2 {
    public static void main(String[] args) {
        String string = "One two three один два три one1 two2 three3 1 2 3 123";
        String[] array = string.split(" ");
        int result = countWords(array);
        System.out.println("There are " + result + " words which contains alphabetic symbols");
    }

    static int countWords(String[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            char[] tempArray = arr[i].toCharArray();
            boolean isAlphabetical = true;
            for (int j = 0; j < tempArray.length; j++) {
                if (((int)tempArray[j] < 65 ||  (int)tempArray[j] > 90) && ((int)tempArray[j] < 97 || (int)tempArray[j] > 122)) {
                    isAlphabetical = false;
                    break;
                }
        }
            if (isAlphabetical) {
                counter++;
            }
        }
        return counter;
    }
}

//Задача 2. У вас есть строка "One two three один два три one1 two2 three3 1 2 3 123".
// Найти количество слов, содержащих только символы латинского алфавита.