package ArraytList2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Behavior Is Easy, State Is Hard", "Edson Yanaga", 652));
        books.add(new Book("Learn Java Idioms and Cache in Your Brain", "Jeanne Boyarsky", 355));
        books.add(new Book("Java Programming from a JVM Performance Perspective", "Monica Beckwith", 215));
        books.add(new Book("Garbage Collection Is Your Friend", "Holly K Cummins", 284));
        books.add(new Book("Java’s Unspeakable Types", "Ben Evans", 75));
        books.add(new Book("The Rebirth of Java", "Sander Mak", 55));
        books.add(new Book("Do You Know What Time It Is?", "Christin Gorma", 365));
        books.add(new Book("Head First Java", "Kathy Sierra, Bert Bates", 555));
        books.add(new Book("Beginning Programming with Java For Dummies", "Barry Burd", 389));
        books.add(new Book("Java: A Beginner’s Guide", "Herbert Schildt", 1160));
        books.add(new Book("Effective Java", "Joshua Bloch", 68));
        System.out.println("=========Splitter=========");
        System.out.println("The quantity of the books is " + books.size());
        printBooks(books);
        addPagesToSomeBook(books, 3);
        printBooks(books);
        removeBooksLess100Pages(books);
        removeLastBook(books);
        convertArrayListToArray(books);
        clearAllBooks(books);
    }

    static void printBooks(ArrayList<Book> books) {
        System.out.println("=========Splitter=========");
        System.out.println("Current list of books");
        for(Book book: books) {
            System.out.println(book);
        }
    }

    static void clearAllBooks(ArrayList<Book> books) {
        System.out.println("=========Splitter=========");
        System.out.println("To clear the books");
        books.clear();
        printBooks(books);
    }

    static void convertArrayListToArray(ArrayList<Book> books) {
        System.out.println("=========Splitter=========");
        System.out.println("ArrayList to Array Conversion");
        Object[] array = books.toArray();
        for (int i = 0; i < books.size(); i++) {
            System.out.println(array[i]);
        }
    }

    static void removeLastBook(ArrayList<Book> books) {
        System.out.println("=========Splitter=========");
        System.out.println("To remove last book");
        books.remove(books.size() - 1);
        printBooks(books);
    }

    static void removeBooksLess100Pages(ArrayList<Book> books) {
        System.out.println("=========Splitter=========");
        System.out.println("To remove all books which have less than 100 pages");
        ArrayList<Book> copyBooks = new ArrayList(books);
        for(Book copyBook: copyBooks) {
            if(copyBook.getPages() < 100) {
                books.remove(copyBook);
            }
        }
        printBooks(books);
    }

    static void addPagesToSomeBook(ArrayList<Book> books, int num) {
        System.out.println("=========Splitter=========");
        System.out.println("To add 10 pages to " + num + " book");
        int currentPages = books.get(num-1).getPages();
        books.get(num-1).setPages(currentPages + 10);
    }
    }




//Задачка по ArrayList:
//Создать ArrayList, содержащий объекты класса Книга (не менне 10 книг).
// У Книги есть название, автор, количество страниц.
//Вывести на консоль размер Листа.
//Вывести содержимое Листа используя for each.
//Изменить количество страниц в третьей книге на +10 (т.е.в книге стало больше на 10 страниц).
//Удалить книги у которых количество страниц меньше 100.
//Удалить последнюю книгу.
//Получить массив содержащий книги из коллекции и вывести на консоль.
//Удалить все книги.