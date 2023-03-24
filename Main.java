package JavaOOP.Part1.Homework;

public class Main {
    public static void main(String[] args) {
        Product orange = new Product("Апельсин", 120, 4.7);
        Product onion = new Product("Лук", 20, 3.7);
        Product banana = new Product("Банан", 50, 4.2);
        Product potato = new Product("Картошка", 60, 4.1);

        Base base = new Base();
        base.addToBase(orange);
        base.addToBase(onion);
        base.addToBase(banana);
        base.addToBase(potato);
        base.printBase();

        Category fruits = new Category();
        fruits.setName("Фрукты");
        fruits.addProductOfCategory(orange);
        fruits.addProductOfCategory(banana);
        fruits.printCategory();

        Category vegetables = new Category();
        vegetables.setName("Овощи");
        vegetables.addProductOfCategory(onion);
        vegetables.addProductOfCategory(potato);
        vegetables.printCategory();


        Basket user1Basket = new Basket();
        User user1 = new User("Василий", "123", user1Basket);
        user1Basket.add(orange);
        user1.printBuying(base);

        Basket user2Basket = new Basket();
        User user2 = new User("Петр", "234", user2Basket);
        user2Basket.add(potato);
        user2.printBuying(base);
    }
}
