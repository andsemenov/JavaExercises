package StringsRegExp;

import java.util.Arrays;

public class StringsRegExpTask3 {
    public static void main(String[] args) {
        String string = "ab джава abcd java 1234 JavaRush aaa 1212 one1";
        String result = searchMinDiffWord(string);
        System.out.println(result);
    }
    static String searchMinDiffWord (String str){
        String[] array = str.split(" ");
        int searchedIndex = 0;
        int minDifferent = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            char[] tempArray = array[i].toCharArray();
                for (int j = 0; j < tempArray.length; j++) {
                int counter =0;
                for (int k = 0; k < tempArray.length; k++) {
                    if (tempArray[k] != tempArray[j]) {
                        counter++;
                    }
                }
                if (counter < minDifferent) {
                    minDifferent = counter;
                    searchedIndex = i;
                }
            }
        }
        return array[searchedIndex];
    }
}

//Задача 3. Напишите методы, который будет искать в строке слово с минимальным количеством различных символов.
// Слово может содержать буквы и цифры. Если таких слов несколько, найти первое из них.
// Например, в строке "ab джава abcd java 1234 JavaRush aaa 1212 one1" найденное слово должно быть "aaa".
