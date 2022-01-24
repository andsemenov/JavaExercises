package ClassesStatic.Task2;

public class Rose extends Flower{
    private static String country = "rus";
    private static int shelfLife = 5;
    private static double price = 2;

    public Rose() {
        super(country, shelfLife, price);
    }


}
