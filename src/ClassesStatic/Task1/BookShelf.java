package ClassesStatic.Task1;

public class BookShelf {
    public static void main(String[] args) {
        Book book1 = new Book();
        System.out.println("There are " + Book.counter + " books on the bookshelf");
        Book book2 = new Book();
        System.out.println("There are " + Book.counter + " books on the bookshelf");

    }
}

//Задача 1. Создать класс Книга (поля и методы определить самостоятельно).
// Реализовать подсчет количества созданных вами книг с помощью статической переменной.