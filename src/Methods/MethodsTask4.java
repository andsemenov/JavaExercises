package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class MethodsTask4 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = inputArray();
        int[] result =sortArray(array);
        scanner.close();
        System.out.println(Arrays.toString(result));
    }
    static int[] inputArray() {
        System.out.println("Enter size of the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the array's elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
    static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
        return array;
    }
}

//Задача 4. Написать метод, который будет сортировать указанный вами массив по возрастанию любым известным вам способом.
// Обязательно использовать его в main.