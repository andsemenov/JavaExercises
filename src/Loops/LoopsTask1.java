package Loops;

public class LoopsTask1 {
    public static void main(String[] args) {
        //do-while
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while ( i <= 15);

        /*//while loop
        int i = 1;
        while (true) {
            System.out.print(i + " ");
            i++;
            if (i > 15 ) {
                break;
            }
        }

        //for loop
        for (int i = 1; i <= 15; i++) {
            System.out.print(i + " ");
        }*/
    }
}

//Задача 1. Вывести на экран числа от 1 до 15 в строку через пробел.
// Сделать это через for, while, do-while, т.е у вас должно быть три варианта решения этой задачи.