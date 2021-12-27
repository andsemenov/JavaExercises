package Arrays2;

public class Arrays2Task1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int highRange = 300;
        int lowRange = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(( Math.random() * (highRange - lowRange) ) + lowRange);
            sum += array[i];
        }
        System.out.println("Average is " + (double)sum/array.length);
    }
}

//Задача 1. Заполнените массив целыми случайными числами из диапазона от 0 до 300 включительно.
// Выведите на экран среднего арифметического элементов массива.
