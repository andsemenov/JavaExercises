package MultidimensionalArrays;

public class MultidimensionalArraysTask1 {
    public static void main(String[] args) {
        String[][] array = new String[3][6];
        for (int i = 0; i < array.length; i++) {
            int code = 97 + i;
            char symbol = (char) code;
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = "" + symbol + (j + 1);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//Задача 1. Создать массив типа String размером 3 на 6.
//И записать в него значения:
//a1  a2  a3  a4  a5  a6
//b1  b2  b3  b4  b5  b6
//c1  c2   c3  c4  c5  c6
//Вывести массив на консоль.