package Arrays2;

public class Arrays2Task3_refactored {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 0, 6, 0, 0, 5, 6, 0, 25, 0, 8, 7, 3, 0, 1, 1, 0, 6, 4};
        for(int i = 0, j = 0; j < array.length; j++) {
            if(array[j] != 0) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i ++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

//Задача 3. Дан массив с числами [5, 4, 3, 0, 6, 0, 0, 5, 6, 0, 25, 0, 8, 7, 3, 0, 1, 1, 0, 6, 4].
// Переместить все нули в конец массива.