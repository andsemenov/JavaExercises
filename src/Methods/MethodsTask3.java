package Methods;

import java.util.Scanner;

import static java.lang.Float.NaN;

public class MethodsTask3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        float number1 = inputNumber();
        float number2 = inputNumber();
        char operation = inputOperation();
        float result = calculateValue(number1, number2, operation);
        System.out.println("The result is " + result);
        scanner.close();
    }

    static float inputNumber() {
        System.out.println("Please enter a number!");
        while (!scanner.hasNextFloat()) {
            System.out.println("It should be a number!");
            scanner.next();
        }
        float number = scanner.nextFloat();
        return number;
    }


    static char inputOperation() {
        String line;
        int count =0;
        System.out.println("Enter an operation (+, -, *, /): ");
        do {
            if (count > 0) System.out.println("The line should start with +, -, * or /");
            line = scanner.next();
            count++;

        } while (!(line.startsWith("+") || line.startsWith("-") || line.startsWith("*") || line.startsWith("/")));
        char operation = line.charAt(0);
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
                result = NaN;
            }
        } else {
            result = NaN;
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