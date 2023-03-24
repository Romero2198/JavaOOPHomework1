package JavaOOP.Part1.Homework;

import java.util.ArrayList;

public class Category {
    private String name;
    private final ArrayList<Product> productsOfCategory = new ArrayList<>();

    public Category() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addProductOfCategory(Product pr) {
        this.productsOfCategory.add(pr);
    }

    public void printCategory() {
        System.out.println("Категория: " + name);
        for (Product item : productsOfCategory) {
            System.out.println(item.toString());
        }
    }
}
