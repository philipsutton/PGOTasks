import java.util.ArrayList;
public class Main {
    public static void main(String[] args)
    {



        Category c1 = new Category();
        Category c2 = new Category ("Food");
        Category c3 = new Category("Drink", new ArrayList<>());

        c1.productAdd(new Product("Hat", 25, "1337"));
        c2.productAdd((new Product("Apple", 1, "7331")));
        c3.productAdd(new Product("Water", 2, "2115"));



        Busket b1 = new Busket();
        Busket b2= new Busket(new User("user1@gmail.com"));
        Busket b3 = new Busket(new User("user2@gmail.com"), new Product[5]);

        Product p1 = new Product ("Hat", 25, "1337");
        Product p2 = new Product ("Apple", 1, "7331");
        Product p3 = new Product ("Water", 2, "2115");

        b2.productAdd(p1);
        b3.productAdd(p3);
        b3.productAdd(p3);
        b3.productAdd(p2);

        b3.productDelete(p3);
        b3.buy();



    }
}
