
public class Main {
    public static void main(String[] args) {

        User user1=new User("email1");
        User user2=new User("name2", "surname2", "email2", "pass");
        User user3=new User("email3");

        user1.isRegistered();
        user1.upgradeToNormal();
        user1.isRegistered();

        Product product1 = new Product("Cereal", 3.5, 245848);
        Product product2 = new Product("Milk", 5, 6354336);
        Product product3 = new Product("Wine", 9.5, 9543666, 13);
        product1.changeAmount(3);
        product2.changePrice(6.7);

    }
}