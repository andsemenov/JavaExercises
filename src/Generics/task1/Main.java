package Generics.task1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] myNum = {10, 20, 30, 40};
        System.out.println(new MinMax(myNum).findMax());
        System.out.println(new MinMax(myNum).findMin());
    }
}

//1.Написать обобщенный класс MinMax(т.е.класс с использованием дженериков),
// который содержит методы для нахождения минимального и максимального элемента массива.
// Массив является переменной класса. Массив должен передаваться в класс через конструктор.