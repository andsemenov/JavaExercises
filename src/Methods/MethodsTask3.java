package Methods;

import java.util.Scanner;

public class MethodsTask3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        float number1 = inputInteger();
        float number2 = inputInteger();
        char operation = inputOperation();
        float result = calculateValue(number1, number2, operation);
        if (result != Float.MAX_VALUE) {
            System.out.println("The result is " + result);
        } else {
            System.out.println("Sorry, some mistake happened");
        }
        scanner.close();
    }

    static int inputInteger() {
        System.out.println("Enter a number: ");
        int value = scanner.nextInt();
        return value;
    }

    static char inputOperation() {
        System.out.println("Enter an operation: ");
        char operation = scanner.next().charAt(0);
        return operation;
    }

    static float calculateValue(float num1, float num2, char operation) {
        float result;
        if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '/') {
            if (num2 != 0) {
            result = num1 / num2;
            } else {
                result = Float.MAX_VALUE;
            }
        } else {
            result = Float.MAX_VALUE;
        }
        return  result;
    }
}

//Задача 3. Написать простой консольный калькулятор, в котором будут следующие методы:
//1) метод должен считывать с консоли целое число и возвращать его
//2) метод должен считывать с консоли какое-то значение и возвращать символ с операцией (+, -, *, /)
//3) метод должен выполнять над двумя числами арифметическую операцию
//4) метод main должен считывать 2 числа, считывать операцию(+, -, *, /),
// производить арифметическую операцию и выводить результат в консоль (использовать все раннее указанные методы).