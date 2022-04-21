package Interfaces.task2;

public class Main {
    public static void main(String[] args) {
        Clothing[] clothings = {new Jeans(Size.XS, 25, "blue"), new Skirt(Size.S, 12.4, "red")};
        ClothingAtelier clothingAtelier = new ClothingAtelier();
        clothingAtelier.dressMan(clothings);
        clothingAtelier.dressWoman(clothings);
    }
}


//2. Ателье
//Создать enum, содержащее размеры одежды (XXS, XS, S, M, L). Enum должен содержать метод getDescription, возвращающий
// строку "Adult size" Переопределить метод getDescription - для константы XXS метод должен возвращать строку
// “Child size”.  Также enum должен содержать числовое значение euroSize(32, 34, 36, 38, 40),
// соответствующее каждому размеру. Создать конструктор, принимающий на вход euroSize.
//Создать интерфейсы MenClothing с методом dressMan() и WomenClothing с методом dressWoman().
//Создать абстрактный класс Clothing, содержащий переменные - size, cost, color.
//Создать классы наследники Clothing - TShirt (реализует интерфейсы MenClothing и WomenClothing),
// Jeans (реализует интерфейсы MenClothing и WomenClothing), Skirt (реализует интерфейс WomenClothing),
// Tie (реализует интерфейс MenClothing).
//Создать массив, содержащий все типы одежды. Создать класс ClothingAtelier, содержащий методы dressWoman(),
// dressMan(), на вход которых будет поступать массив, содержащий все типы одежды. Метод dressWoman() выводит
// на консоль всю информацию о женской одежде. Метод dressMan() выводит на консоль всю информацию о мужской одежде.
