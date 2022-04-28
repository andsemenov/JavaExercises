package Generics.task3;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        OutputProps <String, Dog, Float> outputProps = new OutputProps<>("333", new Dog(), 7.4F);
        outputProps.showClasses();
    }
}

//3.Создать обобщенный класс с тремя параметрами (T, V, K).
//Класс содержит три переменные типа (T, V, K), конструктор, принимающий на вход параметры типа (T, V, K),
// методы возвращающие значения трех переменных.
//Создать метод, выводящий на консоль имена классов для трех переменных класса.
//Наложить ограничения на параметры типа: T должен реализовать интерфейс Comparable (классы оболочки, String),
// V должен реализовать интерфейс Serializable и расширять класс Animal, K должен расширять класс Number.
