package JavaOOP.Part1.Homework;

import java.util.ArrayList;

public class Base {
    private final ArrayList<Product> base = new ArrayList<>();

    public void addToBase(Product pr) {
        this.base.add(pr);
    }

    public void printBase() {
        System.out.println("Каталог продуктов: ");
        for (Product item : this.base) {
            System.out.println(item.toString());
        }
    }

    public void deleteFromBase(Product pt) {
        this.base.remove(pt);
    }
}
