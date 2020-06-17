package test2;

public class Train  extends Vechicle implements DrvingAndStopping{

	public Train(int sizeOfItemsToLoad, int loadingSpace) throws LoadingSpaceException {
		super(sizeOfItemsToLoad, loadingSpace);
		
	}
	
	
	
	public Train t1 = new Train(120,140);
	
	t1.drive();
	
	
	

	
}
