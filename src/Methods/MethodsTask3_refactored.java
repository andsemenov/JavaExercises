package Methods;

import java.util.Scanner;

public class MethodsTask3_refactored {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double number1 = inputNumber();
        double number2 = inputNumber();
        char operation = inputOperation();
        double result = calculateResult(number1, number2, operation);
        System.out.println("The result is " + result);
    }

    public static double inputNumber() {
        System.out.println("Input a number: ");
        if(scanner.hasNextDouble()) {
            return scanner.nextDouble();
        } else {
            System.out.println("Ошибка при вводе. Повторите ввод");
            return inputNumber();
        }
    }

    public static char inputOperation() {
        int operationNumber;
        System.out.println("Select a code: \n1 - to add \n2 - to subtract\n3 - to multiply\n4 - to divide");
        if(scanner.hasNextInt()) {
            operationNumber = scanner.nextInt();
        } else {
            System.out.println("Please input a number from the range of 1 to 4");
            return inputOperation();
        }
        if (operationNumber == 1) {
            return '+';
        } else if (operationNumber == 2) {
            return '-';
        } else if (operationNumber == 3) {
            return '*';
        } else if (operationNumber == 4) {
            return '/';
        } else {
            System.out.println("Wrong operation! Please repeat input!");
            return inputOperation();
        }
    }

    public static double calculateResult(double num1, double num2, char operation) {
        if (operation == '+') {
            return  num1 + num2;
        } else if (operation == '-') {
            return num1 - num2;
        } else if (operation == '*') {
            return num1 * num2;
        } else if (operation == '/') {
            if (num2 == 0) {
                System.out.println("Error! Division by zero!");
                return Double.NaN;
            } else {
                return num1 / num2;
            }
        } else {
            return Double.NaN;
        }
    }
}
