package Generics.task3;

import java.io.Serializable;

public class OutputProps <T extends String, V extends Animal, K extends Number> {
    private T paramT;
    private V paramV;
    private K paramK;

    public OutputProps(T paramT, V paramV, K paramK) {
        this.paramT = paramT;
        this.paramV = paramV;
        this.paramK = paramK;
    }

    public void showClasses () {
        System.out.println("paramT has " + paramT.getClass());
        System.out.println("paramV has " + paramV.getClass());
        System.out.println("paramK has " + paramK.getClass());
    }

    public T getParamT() {
        return paramT;
    }

    public V getParamV() {
        return paramV;
    }

    public K getParamK() {
        return paramK;
    }

}

//3.Создать обобщенный класс с тремя параметрами (T, V, K).
//Класс содержит три переменные типа (T, V, K), конструктор, принимающий на вход параметры типа (T, V, K),
// методы возвращающие значения трех переменных.
//Создать метод, выводящий на консоль имена классов для трех переменных класса.
//Наложить ограничения на параметры типа: T должен реализовать интерфейс Comparable (классы оболочки, String),
// V должен реализовать интерфейс Serializable и расширять класс Animal, K должен расширять класс Number.
