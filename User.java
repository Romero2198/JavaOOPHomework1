package JavaOOP.Part1.Homework;

public class User {
    private String login;
    private String password;
    private Basket currentUserBasket;

    public User() {
    }

    /**
     *
     * @param login Логин пользователя
     * @param password Пароль пользователя
     * @param basketOfProducts Корзина покупок пользователя
     */
    public User(String login, String password, Basket basketOfProducts) {
        this.login = login;
        this.password = password;
        this.currentUserBasket = basketOfProducts;
    }

    public void printBuying(Base base) {
        System.out.println("Покупатель " + this.login + " купил следующие товары: ");
        for (Product item : this.currentUserBasket.getBasketOfProducts()) {
            System.out.println(item.toString());
            base.deleteFromBase(item);
        }
    }
}
