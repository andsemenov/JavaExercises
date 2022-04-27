package Generics.task2;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 5));
        System.out.println(calculator.multiply(1, 5));
        System.out.println(calculator.divide(1, 5));
        System.out.println(calculator.subtraction(1, 5));
    }
}

//2.Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы - sum, multiply, divide,
// subtraction. Параметры этих методов  - два числа разного типа, над которыми должна быть произведена операция.