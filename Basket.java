package JavaOOP.Part1.Homework;

import java.util.ArrayList;

public class Basket {
    private final ArrayList<Product> basketOfProducts = new ArrayList<>();

    public Basket() {
    }

    public ArrayList<Product> getBasketOfProducts() {
        return basketOfProducts;
    }

    public void add(Product pr) {
        this.basketOfProducts.add(pr);
    }
}
