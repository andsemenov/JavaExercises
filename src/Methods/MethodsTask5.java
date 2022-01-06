package Methods;

import java.util.Scanner;

public class MethodsTask5 {
    private static int min, max;
    public static void main(String[] args) {

        System.out.println("Enter a first integer: ");
        int number1 = inputNumber();
        System.out.println("Enter a second integer: ");
        int number2 = inputNumber();
        System.out.println("The random integer from the range is " + returnNumberFromRange(number1, number2));
    }

    static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextFloat()) {
            System.out.println("It should be a number!");
            scanner.next();
        }
        int number = scanner.nextInt();
        return number;
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
