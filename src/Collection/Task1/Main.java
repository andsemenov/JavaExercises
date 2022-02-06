package Collection.Task1;

import java.util.ArrayList;
import java.util.HashSet;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        String initialString = "1, 2, 3, 4, 4, 5, 5, 6, 5, 7, 8, 9, 9";
        System.out.println("The string before:");
        System.out.println(initialString);
        ArrayList<String> listOfDigits = new ArrayList<>(asList(initialString.split(",")));
        HashSet<String> results = new HashSet<>(listOfDigits);
        String resultString = String.join(",", results);
        System.out.println("The string after:");
        System.out.println(resultString);
    }
}

//Задача 1
//Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5, 5, 6, 5, 7, 8, 9, 9".
//Избавиться от повторяющихся элементов в строке.
//Вывести результат на консоль.