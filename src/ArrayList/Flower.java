package ArrayList;

public class Flower {
    private String country;
    private int shelfLife;
    private double price;

    public Flower(String country, int shelfLife, double price) {
        this.country = country;
        this.shelfLife = shelfLife;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "country='" + country + '\'' +
                ", shelfLife=" + shelfLife +
                ", price=" + price +
                '}';
    }
}

