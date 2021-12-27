package Arrays2;

import java.util.Scanner;

public class Arrays2Task2 {
    public static void main(String[] args) {
        int[] array = new int[25];
        int lowRange = 1;
        int highRange = 25;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number in the range of 1 to 25: ");
        int number = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(( Math.random() * (highRange - lowRange) ) + lowRange);
            System.out.println(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println("The index is " + i);
                break;
            } else if (i == array.length - 1) {
                System.out.println("There is no the number in the array");
            }
        }
    }
}

//Задача 2. Создайте массив из 25 элементов и заполните его случайными числами от 1 до 25 включительно.
// Пусть пользователь введет случайное число из указанного выше диапозона.
// Найдите в массиве первый элемент, который равен введенному пользователем числу.
// Выведите на экран индекс найденного элемента, или, если элемент не найден, соответствующее сообщение.