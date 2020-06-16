package task6;

public class Furniture extends Room {
	private String name;
	private double price;
    private static final double VAT = 0.23;

    public Furniture(String name, double price) {
    	this.name=name;
    	this.price=price;
    	    }
    
  
    
    public double getPrice(boolean countVAT) {
    	if(countVAT=true) {
    		return price;
    	}
    	else
    	return price - (price*VAT);
    }
}
