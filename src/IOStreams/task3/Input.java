package IOStreams.task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {
    private static ArrayList<Integer> numbers = new ArrayList<>();
    private static Integer inputNumber() {

        System.out.println("Input a number: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Wrong input! Please input a number!");
            return inputNumber();
        }
    }
    public static ArrayList<Integer> createList(){
        while(numbers.size() < 15) {
            numbers.add(Input.inputNumber());
        }
        return numbers;
    }

}
