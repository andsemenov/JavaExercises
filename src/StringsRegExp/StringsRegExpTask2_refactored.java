package StringsRegExp;

public class StringsRegExpTask2_refactored {
    public static void main(String[] args) {
        String string = "One two three один два три one1 two2 three3 1 2 3 123";
        String[] array = string.split(" ");
        int result = countWords(array);
        System.out.println("There are " + result + " words which contains alphabetic symbols");
    }

    static int countWords(String[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].matches("[a-zA-Z]+")) {
                counter++;
            }
        }

        return counter;
    }
}

//Задача 2. У вас есть строка "One two three один два три one1 two2 three3 1 2 3 123".
// Найти количество слов, содержащих только символы латинского алфавита.