package Methods;

import java.util.Scanner;

public class MethodsTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Enter a power: ");
        int power = scanner.nextInt();
        System.out.println("The result is " + calcPower(number, power));
        scanner.close();
    }
    static float calcPower(int number, int pow) {
        float result = 1;
        if (pow > 0) {
            for (int i = 1; i <= pow; i++) {
                result *= number;
            }
        } else if (pow < 0) {
            for (int i = -1; i >= pow; i--) {
                result /= number;
            }
        }
        return result;
    }
}

//Задача 2. Написать методы, который возводит число в степень.
// Обязательно использовать его в main.