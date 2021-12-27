package Arrays2;

public class Arrays2Task3 {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 0, 6, 0, 0, 5, 6, 0, 25, 0, 8, 7, 3, 0, 1, 1, 0, 6, 4};
        int length = array.length;

            for (int i = 0; i < length; i++) {
                if (array[i] ==0 && array[length - 1] != 0) {
                    array[i]=array[length - 1];
                    array[length - 1] = 0;
                    length--;

                } else if (array[i] ==0 && array[length - 1] == 0){
                    while (array[length - 1] == 0) {
                        length--;
                    }
                    array[i]=array[length - 1];
                    array[length - 1] = 0;
                    length--;
                }
            }
        for (int i =0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

//Задача 3. Дан массив с числами [5, 4, 3, 0, 6, 0, 0, 5, 6, 0, 25, 0, 8, 7, 3, 0, 1, 1, 0, 6, 4].
// Переместить все нули в конец массива.
