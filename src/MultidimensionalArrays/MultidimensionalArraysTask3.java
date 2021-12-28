package MultidimensionalArrays;

import java.util.Scanner;

public class MultidimensionalArraysTask3 {
    public static void main(String[] args) {
        int highRange = 100;
        int lowRange = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of rows");
        int n = scanner.nextInt();
        System.out.println("Enter a number of columns");
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for ( int i = 0; i < array.length; i++) {
            for ( int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random() * ((highRange - lowRange) + 1)) + lowRange;
                System.out.print(array[i][j] + "\t");
                if (max < array[i][j]) {
                    max = array[i][j];
                }
                sum += array[i][j];
            }
            System.out.println();
        }
        System.out.println("The maximal number is " + max);
        double average = 1.0 * sum/(n*m);
        System.out.println("The average is " + average);
    }
}

//Задача 3. Создать многомерный массив размерностью n на m. n и m ввести с клавиатуры.
// Заполнить массив использую Math.random() случайными числами от 1 до 100. Вывести массив на консоль.
// Найти среднее арифметическое элементов массива и максимальный эллемент массива и вывести их на консоль.