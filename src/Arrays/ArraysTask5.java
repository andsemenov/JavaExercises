package Arrays;

public class ArraysTask5 {
    public static void main(String[] args) {
        String[] strings = {"Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One"};
        String temp;
        int length = strings.length;
        for (int i = 0; i < length; i++) {
            temp = strings[i];
            strings[i] = strings[length - 1];
            strings[length - 1] = temp;
            length--;
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }
    }
}

//Задача 5. Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке.
// Не используйте дополнительный массив для хранения результатов. Выведите конечный (поменяный) массив в консоль.