package Arrays;

public class ArraysTasks {
    public static void main(String[] args) {
        //array of integers
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        //array of strings
        String[] strings = new String[]{"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }
        System.out.println();
    }
}

//Задача 1. Создать массив из десяти целых чисел и вывести его на консоль.
//Создать массив из 10 строковых значений и вывести его на консоль.
//