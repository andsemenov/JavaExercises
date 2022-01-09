package Loops;

import java.util.Scanner;

public class LoopsTask5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sum: ");
        double sum = scanner.nextDouble();
        System.out.println("Enter a duration in months: ");
        int months = scanner.nextInt();
        double total = sum;
        int i = 0;
        while (i < months) {
            i++;
            total = total * 1.012;
        }
        System.out.println("You will get " + total + " in " + months + " months");
    }
}

//Задача 5. Напишите консольную программу, в которую пользователь вводит сумму вклада и количество месяцев.
// А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
//За каждый месяц банк начисляет к сумме вклада 1.2% от суммы.
