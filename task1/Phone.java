package task1;

public class Phone {
	   String brand;
	   double screenResolution;
	   String number;

	   public Phone(String brand, double screenResolution, String number){

	       this.brand = brand;
	       this.screenResolution = screenResolution;
	       this.number = number;


	   }

	public void sendMessage(String x, int y)
	{
	    System.out.println("Sending message " + x + " to phone number" + y);
	}

	}
