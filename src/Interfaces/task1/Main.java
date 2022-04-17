package Interfaces.task1;

public class Main {
    public static void main(String[] args) {
        Runner[] runners = {new Cat("Tom"), new Dog("Spike"), new Dog("Killer"),
                new Cat("Barsik"), new Cat("Sonya") };
        for (Runner  runner: runners)
        {
            runner.run();
        }

        new Dog().runDogs(runners);
        new Cat().runCats(runners);

    }
    interface Runner {
        void run();
    }
    static class Dog implements Runner {
        String name;

        public Dog () {
        }

        public Dog(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println(name + " is running");
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    '}';
        }
        void runDogs(Runner[] runners) {
            for (Runner runner: runners) {
                if (runner instanceof Dog) {
                    System.out.println(runner);
                }
            }
        }
    }
    static class Cat implements Runner {

        String name;
        public Cat() {}
        public Cat(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println(name + " is running");
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    '}';
        }
        void runCats(Runner[] runners) {
            for (Runner runner: runners) {
                if (runner instanceof Cat) {
                    System.out.println(runner);
                }
            }
        }
    }

}

//1. Гонки Домашних животных)))
//Создать интерфейс Runner, содержащий метод run().
//Создать класс Dog, реализующий интерфейс Runner.
//Создать класс Cat, реализующий интерфейс Runner.
//Создать массив типа Runner, который будет содержать котиков и собачек.
//В цикле пройти по массиву и вызвать метод run() для каждого домашнего животного.
//Создать метод runCats(Runner[] runner) в классе Cat, который выводит на консоль всех бегущих котиков.
//Создать метод runDogs(Runner[] runner) в классе Dog, который выводит на консоль всех бегущих собачек.
//Используем оператор instanceof.