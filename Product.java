package JavaOOP.Part1.Homework;

public class Product {
    private String productName;
    private double price;
    private double rating;

    /**
     *
     * @param productName Название продукта
     * @param price Цена продукта
     * @param rating Рейтинг продукта
     */
    public Product(String productName, double price, double rating) {
        this.productName = productName;
        this.price = price;
        this.rating = rating;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return String.format("Название продукта: %s, Цена продукта: %f, Рейтинг продукта: %f",
                this.productName, this.price, this.rating);
    }
}
