package Loops;

import java.util.Scanner;

public class LoopsTask2 {
    public static void main(String[] args) {
        System.out.println("Enter an integer:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum +=i;
        }
        System.out.println("The sum is " + sum);
    }
}

//Задача 2. Напишите программу, где пользователь вводит любое целое положительное число с клавиатуры.
// А программа суммирует все числа от 1 до введенного пользователем числа.
