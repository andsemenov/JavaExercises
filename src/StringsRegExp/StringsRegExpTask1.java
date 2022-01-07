package StringsRegExp;

import java.util.Locale;
import java.util.Scanner;

public class StringsRegExpTask1 {
    static String string = "I like JavaRush!!!";
    static String javarush = "JavaRush";
    public static void main(String[] args) {
        System.out.println("The last symbol is: " + string.charAt(string.length() - 1));
        System.out.println("The string contains the word \"JavaRush\": " + string.contains(javarush));
        System.out.println("The position in line is " + string.indexOf("like"));
        System.out.println(string.replace('a', '!'));
        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());
        cutJavaRush(javarush);
        repeatString();
    }

    static void cutJavaRush(String text) {
        int startIndex = text.indexOf(javarush);
        String result = text.substring(startIndex, startIndex + javarush.length());
        System.out.println(result);
    }

    static void repeatString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number of repetition: ");
        while (!scanner.hasNextFloat()) {
            System.out.println("It should be a number!");
            scanner.next();
        }
        int n = scanner.nextInt();
        System.out.println(string.repeat(n));
        scanner.close();
    }
}

//Задача1. У вас есть строка “I like JavaRush!!!”. Порабойте немного с ней.
//1. Выведите в консоль последний символ строки.
//2. Проверьте, содержит ли ваша строка подстроку “JavaRush”.
//3. Найдите позицию подстроки “like” в строке “I like JavaRush!!!”.
//4. Замените все символы “а” на “!”.
//5. Преобразуйте строку к верхнему регистру.
//6. Преобразуйте строку к нижнему регистру.
//7. Вырежьте строку JavaRush c помощью метода String.substring().
//8. Выведи строку на консль n раз. n задать с клавиатуры.