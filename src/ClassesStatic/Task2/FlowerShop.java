package ClassesStatic.Task2;

import java.util.Scanner;

public class FlowerShop {
    final static int NUMBER_BOUQUETS = 5;
    static Flower[][] bouquets = new Flower[NUMBER_BOUQUETS][];
    static int counter = 0;

    private static double totalSum;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        prepareBouquets();
        System.out.println("The total price of all bouquets is " + calculateSum(bouquets));
        System.out.println("The amount of flowers is " + counter);
    }
    static void prepareBouquets() {
        for (int i = 0; i < NUMBER_BOUQUETS; i++) {
            System.out.println("Bouquet #" + (i + 1));
            int length = validateInputQuantity();
            bouquets[i] = new Flower[length];
            for (int j = 0; j < length; j++) {
                int currentFlower = chooseFlower ();
                if (currentFlower == 1) {
                    bouquets[i][j] = new Rose();
                } else if (currentFlower == 2) {
                    bouquets[i][j] = new Tulip();
                } else if (currentFlower == 3) {
                    bouquets[i][j] = new Lily();
                } else if (currentFlower == 4) {
                    bouquets[i][j] = new Chrysanthemum();
                }
            }

        }
    }
    static int chooseFlower () {
        System.out.println("Enter 1 to add Rose, 2 to add Tulip, 3 to add Lily, 4 to add Chrysanthemum");
        if (scanner.hasNextInt()) {
            int chosenFlower = scanner.nextInt();
            if (chosenFlower >= 1 && chosenFlower <= 4) {
                return chosenFlower;
            } else {
                System.out.println("Please, repeat input!");
                return chooseFlower();
            }
        } else {
            System.out.println("Please enter an integer!");
            return chooseFlower();
        }
    }

public static double inputNumber() {
    System.out.println("Input a number: ");
    Scanner scanner = new Scanner(System.in);
    if(scanner.hasNextDouble()) {
        return scanner.nextDouble();
    } else {
        System.out.println("Wrong input! Please input a number!");
        return inputNumber();
    }
}

    static int validateInputQuantity () {
        System.out.println("Enter a number of flowers in the bouquet (positive integer equal or greater than 3): ");
        int quantity;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter an integer!");
                scanner.next();
            }
            quantity = scanner.nextInt();
            if (quantity >= 3) {
                break;
            } else {
                System.out.println("Please enter a positive integer equal 3 or greater!");
            }
        } while (quantity <= 3);
        return quantity;
    }

    static double calculateSum (Flower[][] bouquets) {
        double sum = 0;
        for (int i = 0; i < bouquets.length; i++) {
            for (int j = 0; j < bouquets[i].length; j++) {
                sum += bouquets[i][j].getPrice();
                counter++;
            }
        }
        return sum;
    }
}

//Задача 2. Создать класс Цветок, который содержит переменные страна производитель, срок хранения в днях, цена.
// Создать классы наследники класс Цветок (Роза, Лилия, Тюльпан и Хризантемы).
// Собрать на продажу 5 различных букетов (используем массив) и подсчитать стоимость этих букетов.
// В букет должно входить не менее трех любых цветов.
// Подсчитать количество проданных цветов (используем статическую переменную).