package Methods;

import java.util.Scanner;

public class MethodsTask5 {
    private static int min, max;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first integer: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter a second integer: ");
        int number2 = scanner.nextInt();
        System.out.println("The random integer from the range is " + returnNumberFromRange(number1, number2));
        scanner.close();
    }
    static int returnNumberFromRange(int num1, int num2) {
        findMinMax(num1, num2);
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }
    static void findMinMax(int num1, int num2) {
        if (num1 <= num2) {
            min = num1;
            max = num2;
        } else {
            min = num2;
            max = num1;
        }
    }
}

//Задача 5. Написать метод, который будет иметь два целочисленных параметра a и b,
// и в качестве своего значения возвращать случайное целое число из отрезка [a;b].
// Обязательно использовать его в main.
