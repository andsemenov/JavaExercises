package MultidimensionalArrays;

import java.util.Scanner;

public class MultidimensionalArraysTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a quantity of array's rows and columns.");
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random()*19);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

//Задача 2. Создать квадратный массив целых чисел размерностью n на n. n ввести с клавиатуры.
//Заполнить его любыми целыми числами. Вывести массив на консоль.