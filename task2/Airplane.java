package task2;

public class Airplane {
	
	String brand;
	int seatNumber;
	int engineProductionYear;
	int enginePower;
	
	public Airplane(String brand, int seatNumber)
	{
		this.brand = brand;
		this.seatNumber = seatNumber;
		
	}
	
	public void displayAirplaneInfo(String brand, int seatNumber)
	{
		System.out.println("Brand: " + this.brand + " Seat number: " + this.seatNumber);
		
	}
	
	
}
