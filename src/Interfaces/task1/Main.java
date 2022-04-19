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

    static class Pet {
        private String name;

        public Pet(String name) {
            this.name = name;
        }

        public Pet() {
        }

        public String getName() {
            return name;
        }
    }
    interface Runner {
        void run();
    }
    static class Dog extends Pet implements Runner {
        public Dog(String name) {
            super(name);
        }

        public Dog() {
        }

        @Override
        public void run() {
            System.out.println("Dog " + getName() + " is running");
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + getName() + '\'' +
                    '}';
        }
        void runDogs(Runner[] runners) {
            for (Runner runner: runners) {
                if (runner instanceof Dog) {
                    runner.run();
                }
            }
        }
    }
    static class Cat extends Pet implements Runner {
        public Cat(String name) {
            super(name);
        }

        public Cat() {
        }

        @Override
        public void run() {
            System.out.println("Cat " + getName() + " is running");
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + getName() + '\'' +
                    '}';
        }
        void runCats(Runner[] runners) {
            for (Runner runner: runners) {
                if (runner instanceof Cat) {
                    runner.run();
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