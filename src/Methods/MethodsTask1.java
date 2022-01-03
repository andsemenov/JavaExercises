package Methods;

import java.util.Scanner;

public class MethodsTask1 {
    static int findMinimum(int num1, int num2)
    {
        if (num1 < num2)
        {
            return num1;
        }
        else if (num2 < num1)
        {
            return num2;
        }
        else
        {
            return num1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter a second number: ");
        int number2 = scanner.nextInt();
        System.out.println("The minimum is " + findMinimum(number1, number2));
        scanner.close();
    }
}

//Задача 1. Написать метод, который бы возвращал из 2 чисел меньшее число.
// Обязательно использовать этот метод в main.