package Objects.task2;

import java.util.Scanner;
import java.util.Arrays;

public class Purchase {
    static final double DISCOUNT_FOR_THREE_A = 0.1f;
    static final double DISCOUNT_FOR_THREE_B = 0.12f;
    static final double DISCOUNT_FOR_BOTH = 0.08f;
    static Product[] array = new Product[0];
    public static void main(String[] args) {
        System.out.println("Please add products to shopping card");
        System.out.println("======================================");
        boolean isContinue = true;
        Scanner sc = new Scanner(System.in);
        while (isContinue) {
            System.out.println("Enter a name of product");
            String name = sc.next();
            String category = validateInputCategory(sc);
            double price = validateInputPrice(sc);
            int quantity = validateInputQuantity(sc);

            Product product = new Product(name, price, category, quantity );
            addProductToBusket(product);
            System.out.println();
            System.out.println("To continue shopping - press 1, if you want to pay - another key");
            if (!sc.next().equals("1") ) {/////////////////////////////
                isContinue = false;
            }
            System.out.println("======================================");
        }
        double sumDiscounted = calculateSumDiscounted(array);
        System.out.println("The sum after discount: " + sumDiscounted);
    }

    static double calculateSumDiscounted(Product[] array) {
        int countCategoryA = 0, countCategoryB = 0, quantityInCategoryA = 0, quantityInCategoryB = 0;
        float sumCategoryA = 0, sumCategoryB = 0, sumAfterAllDiscounts;
        for(int i = 0; i < array.length; i++) {
            //
            System.out.println("The product " + array[i].getName() + " Category: " + array[i].getCategory() +
                    " price before discount " + array[i].getPrice() + " quantity: " + array[i].getQuantity());
            //
            if (array[i].getCategory().equals("A")) {
                countCategoryA += array[i].getQuantity();
                sumCategoryA += array[i].getPrice() * array[i].getQuantity();
                quantityInCategoryA += array[i].getQuantity();
            } else if (array[i].getCategory().equals("B")) {
                countCategoryB += array[i].getQuantity();
                sumCategoryB += array[i].getPrice() * array[i].getQuantity();
                quantityInCategoryB += array[i].getQuantity();
            }
        }
        if (countCategoryA >= 3) {
            sumCategoryA *= (1 - DISCOUNT_FOR_THREE_A);
        }
        if (countCategoryB >= 3) {
            sumCategoryB *= (1 - DISCOUNT_FOR_THREE_B);
        }
        sumAfterAllDiscounts = sumCategoryA + sumCategoryB;

        if(quantityInCategoryA > 0 && quantityInCategoryB > 0 ) {
            sumAfterAllDiscounts *= (1 - DISCOUNT_FOR_BOTH);
        }
        return Math.round(sumAfterAllDiscounts * 100.0) / 100.0;
    }


    static void addProductToBusket(Product product) {
        Product[] result = Arrays.copyOf(array, array.length + 1);
        result[result.length - 1] = product;
        array = result;
        System.out.println("======================================");
        System.out.println();
        System.out.println("Your current shopping cart:");
        System.out.println();
        for(int i = 0; i < array.length; i++) {
            System.out.println("The product " + array[i].getName() + " Category: " + array[i].getCategory() +
                    " price before discount " + array[i].getPrice() + " quantity: " + array[i].getQuantity());
            System.out.println();
            }
        System.out.println("======================================");
    }
    static double validateInputPrice(Scanner sc) {
        System.out.println("Enter a price: ");
        float price;
        do {
            while (!sc.hasNextFloat()) {
                System.out.println("Please enter a positive number!");
                sc.next();
            }
            price = sc.nextFloat();
            if (price > 0) {
                break;
            } else {
                System.out.println("Please enter a positive number greater than 0!");
            }
        } while (price <= 0);
        return price;
    }

    static int validateInputQuantity (Scanner sc) {
        System.out.println("Enter a quantity: ");
        int quantity;
        do {
            while (!sc.hasNextInt()) {
                System.out.println("Please enter a positive integer!");
                sc.next();
            }
            quantity = sc.nextInt();
            if (quantity > 0) {
                break;
            } else {
                System.out.println("Please enter a positive integer greater than 0!");//
            }
        } while (quantity <= 0);
        return quantity;
    }

    static String validateInputCategory(Scanner sc) {
        String category;
        do {
            System.out.println("Enter a category - A or B: ");
            category = sc.next();
        } while (!category.equalsIgnoreCase("A") && !category.equalsIgnoreCase("B"));
        return category;
    }

}

//Задача 2.
//Есть две категории товаров 'Товары группы А' и 'Товары группы В'.
//а)Если покупатель берет три и более товара группы А, то получает скидку 10%.
//б) если берет три и более товаров группы B - получает скидку 12%.
//в) если берет хотя бы по одному товару из обеих групп - получает скидку 8%.
//Дайте покупателю сделать выбор товаров и посчитайте итоговую сумму покупки.
//Задачу можно решать любыми доступными вам способами)