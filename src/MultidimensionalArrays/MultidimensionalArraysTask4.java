package MultidimensionalArrays;

public class MultidimensionalArraysTask4 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int lowRange = 1;
        int highRange = 10;
        boolean isSymmetric = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random() * ((highRange - lowRange) + 1)) + lowRange;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != array[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
        }
        String output = isSymmetric == true? "The array is symmetric" : "The array is not symmetric";
        System.out.println(output);
    }
}

//Задача 4. Ввести с клавиатуры элементы квадратного двумерного массива целых чисел размерностью 5 на 5.
// Елементы массива в диапозоне от 1 до 10. Проверьте, является  ли  двумерный  массив  симметричным  относительно
// главной диагонали.
// Главная диагональ — та, которая идёт из левого верхнего угла двумерного массива в правый нижний.