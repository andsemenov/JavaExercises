package Arrays;

public class ArraysTask3 {
    public static void main(String[] args) {
        int[] numbers = {4, 99, 18, 15, 1};
        int temp;
        temp = numbers[0];
        numbers[0] = numbers[1];
        numbers[1] = temp;
        for (int i =0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}

//Задача 3.
// Имеется массив из четырёх чисел int[] numbers = {4, 99, 18, 15, 1};.
// Поменяйте местами первый и второй элемент массива.