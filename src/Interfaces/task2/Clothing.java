package Interfaces.task2;

public abstract class Clothing {
    private Size size;
    private double cost;
    private String color;

    public Clothing(Size size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public Clothing(Size size, String color) {
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "size=" + size +
                ", cost=" + cost +
                ", color='" + color + '\'' +
                '}';
    }
}

interface MenClothing {
    void dressMan();
}

interface WomenClothing {
    void dressWoman();
}
class TShirt extends Clothing implements MenClothing, WomenClothing{

    public TShirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    public TShirt(Size size, String color) {
        super(size, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Men TShirt");

    }

    @Override
    public void dressWoman() {
        System.out.println("Women TShirt");
    }
}

class Jeans extends Clothing implements MenClothing, WomenClothing {

    public Jeans(Size size, double cost, String color) {
        super(size, cost, color);
    }

    public Jeans(Size size, String color) {
        super(size, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Men Jeans");

    }

    @Override
    public void dressWoman() {
        System.out.println("Women Jeans");

    }
}

class Skirt extends Clothing implements WomenClothing {

    public Skirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    public Skirt(Size size, String color) {
        super(size, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Women's skirt");

    }
}


class Tie extends Clothing implements MenClothing {

    public Tie(Size size, double cost, String color) {
        super(size, cost, color);
    }

    public Tie(Size size, String color) {
        super(size, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Men Tie");

    }
}
