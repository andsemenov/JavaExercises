package Collection.Task2;

import java.util.HashMap;

public class Main {
    static HashMap<String, Toy> toys = new HashMap<String, Toy>();
    public static void main(String[] args) {

        Toy toy1 = new Toy("Barbie", "Fashion & Dolls", 134.5);
        toys.put(toy1.name, toy1);
        Toy toy2 = new Toy("Air hockey", "Board games", 340.0);
        toys.put(toy2.name, toy2);
        Toy toy3 = new Toy("Lego Technic 56789", "lego & Bricks", 150.0);
        toys.put(toy3.name, toy3);
        outputEntrySet();
        outputKeySet();
        outputValues();
    }

    static void outputEntrySet() {
        System.out.println("Using entrySet():");
        for(var pair: toys.entrySet()) {
            String key = pair.getKey();
            Toy value = pair.getValue();
            System.out.println(key + "-->" + value);
        }
        System.out.println();
    }
    static void outputKeySet() {
        System.out.println("Using keySet():");
        for (String key: toys.keySet()) {
            Toy value = toys.get(key);
            System.out.println(key + "-->" + value);
        }
        System.out.println();
    }

    static void outputValues() {
        System.out.println("Using values():");
        for (Toy item: toys.values()) {
            System.out.println(item);
        }
    }
}

//Задача 2
//Создать класс Игрушка (поля придумать произвольно).
//Создайте HashMap, содержащий пары значений  - имя игрушки и объект Игрушка.
//Перебрать и распечатать пары значений - entrySet().
//Перебрать и распечатать набор из имен продуктов  - keySet().
//Перебрать и распечатать значения продуктов - values().
//Для каждого перебора создать свой метод.


