public class Busket {
    User user;
    Product[] productList;
    int busketProductsNumber;
    double price = 0;

    public Busket() {

    }

    public Busket(User user) {
        this.user = user;
    }

    public Busket(User user, Product[] productList) {
        this.user = user;
        this.productList = productList;
    }


    public void productAdd(Product product) {
        if (productList == null)
            productList = new Product[1];
        if (productList.length <= busketProductsNumber) {
            Product[] productListCopy = new Product[busketProductsNumber++];

            for (int y = 0; y < productList.length; y++) {
                productListCopy[y] = productList[y];
            }
            productList = productListCopy;
        }
        productList[busketProductsNumber++] = product;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void buy() {
        if (productList == null) {
            System.out.println("The busket is empty");

        } else {
            for (int x = 0; x < productList.length; x++) {
                if (productList[x] == null)
                    price += 0;
                else
                    price += productList[x].price;
            }
            System.out.println("You need to pay: " + price + " zl");
        }
    }

    public void productDelete(Product product)

    {
        boolean change = false;

        for (int i = 0; i < productList.length; i++) {

            if (productList[i] != null && productList[i].name.equals(product.name)) {
                productList[i] = null;
                change = true;
            }
        }
        if (change == true) {
            int counterOfproductListCopy = 0;
            Product[] productsCopy = new Product[productList.length - 1];

            for (int i = 0; i < productList.length; i++) {
                if (productList[i] != null) {
                    productsCopy[counterOfproductListCopy++] = productList[i];
                }
            }
            productList = productsCopy;
        }

    }




}
