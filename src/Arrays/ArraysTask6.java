package Arrays;

public class ArraysTask6 {
    public static void main(String[] args) {
        int[] array = new int[15];
        int lowRange = -50;
        int highRange = 50;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(( Math.random() * (highRange - lowRange) ) + lowRange);
            if (max < array[i]) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n" + "Maximum is " + max);
    }
}

//Задача 6. Создайте массив из 15 случайных целых чисел из отрезка от -50 до 50.
// Определите какой элемент является в этом массиве максимальным.
// Для генерации случайных чисел использовать Math.random().
// Выведите сам массив и его максимальный элемент на консоль

