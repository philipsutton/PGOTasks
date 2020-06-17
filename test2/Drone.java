package test2;

public class Drone implements DrvingAndStopping, Flying{

	
	
	
	public Drone(int x, int y) {
		
	}
	
	
	
	public Drone d1 = new Drone (30,40);
	
	d1.StartFlying();
	
	System.out.println("Drone is flying to " + x + ", " + y);
	
	d1.StopFlying();
	
	d1.drive();
	
	System.out.println("Drone is driving to " + x + ", " + y);
	
	d1.stop();
	
	
}
