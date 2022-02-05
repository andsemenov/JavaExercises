package ArrayList;

import java.util.ArrayList;

public class Bouquet {
    private ArrayList<Flower> bouquet = new ArrayList<>();
    private int quantity = 0;
    private double price = 0;
    public void addFlower(Flower flower) {
        bouquet.add(flower);
        quantity ++;
        price += flower.getPrice();
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
