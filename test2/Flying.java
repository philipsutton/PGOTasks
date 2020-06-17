package test2;

public interface Flying {

	public static final int maxSpeed= 300;
	
	public boolean isFlying= false;
	
	public static void startFlying(boolean isFlying) {
		isFlying=true;
		System.out.println("Plane is flying");
	}
	
	public static void stopFlying(boolean isFlying) {
		isFlying=false;
		System.out.println("Plane isn't flying");
	}
}
