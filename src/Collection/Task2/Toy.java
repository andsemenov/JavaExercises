package Collection.Task2;

public class Toy {
    String name, category;
    double price;

    public Toy(String name, String category, double price){
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
