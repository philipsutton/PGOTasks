public class Product {
    public String name;
    public double price;
    private String productCode;
    private int numberOfItems;

    public Product (String name, double price, String productCode)
    {
        this.name = name;
        this.price=price;
        this.productCode=productCode;

    }
    public Product (String name, double price, String productCode, int numberOfItems)
    {
        this.name = name;
        this.price=price;
        this.productCode=productCode;
        this.numberOfItems=numberOfItems;
    }



    public void setNumberOfItems(int numberOfItems)
    {
        this.numberOfItems=numberOfItems;
    }

    public void setPrice(double price)
    {
        this.price=price;
    }
}
