package Arrays2;



public class Arrays2Task4 {
    public static void main(String[] args) {
        int[] array = new int[11];
        int lowRange = -1;
        int highRange = 1;
        int popular = lowRange;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * ((highRange - lowRange) + 1)) + lowRange;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int max = Integer.MIN_VALUE;
        int probablyMax = max;
        for (int j = lowRange; j <= highRange; j++) {
            int counter = 0;
            for (int i = 0; i < array.length; i++) {
                if (j == array[i]) {
                    counter++;
                }
            }
            System.out.println(counter);
            if (max < counter) {
                max = counter;
                popular = j;
            } else if (max == counter) {
                probablyMax = max;

            }
        }
        if (max != probablyMax) {
            System.out.println("The most popular is "+ popular + ". It has been met " + max + " times.");
        }
    }
}

//Задача 4. Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку.
// Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран.
// Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.