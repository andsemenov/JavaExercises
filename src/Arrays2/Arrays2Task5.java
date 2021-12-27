package Arrays2;

public class Arrays2Task5 {
    public static void main(String[] args) {
        int[] array = new int[12];
        int lowRange = -10;
        int highRange = 10;
        int plus;
        int minus;
        do {
            plus = 0;
            minus = 0;
            for (int i = 0; i < array.length; i++) {
                while (array[i] == 0) {
                    array[i] = (int) (Math.random() * ((highRange - lowRange) + 1)) + lowRange;
                }
                if (array[i] > 0) {
                    plus++;
                } else {
                    minus++;
                }
            }
        }  while (plus != 6 && minus != 6);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

//Задача 5. Программа должна создать массив из 12 случайных целых чисел из отрезка [-10;10] включительно таким образом,
// чтобы отрицательных и положительных элементов там было поровну и не было нулей.
// При этом порядок следования элементов должен быть случаен
// (т. е. не подходит вариант, когда в массиве постоянно выпадает сначала 6 положительных, а потом 6 отрицательных чисел
// или же когда элементы постоянно чередуются через один и пр.). Вывести полученный массив на экран.