package ClassesStatic.Task2;

public class Chrysanthemum extends Flower{
    private static String country = "rus";
    private static int shelfLife = 4;
    private static double price = 1;

    public Chrysanthemum() {
        super(country, shelfLife, price);
    }
}
