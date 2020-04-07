import java.util.ArrayList;
import java.util.List;

public class Category {
   private String categoryName;
  private  ArrayList<Product> productList = new ArrayList<>();




 public Category() {
     this.productList = new ArrayList<>();
 }

    public Category(String name) {
       this.categoryName=categoryName;
        this.productList = new ArrayList<>();
    }

    public Category(String name, ArrayList<Product> productList ){

    }

 public void setName(String name)
 {
     this.categoryName=categoryName;

 }

 public void productAdd(Product product){
     productList.add(product);
 }

 public void productDelete(Product product){
     productList.remove(product);
 }









}
