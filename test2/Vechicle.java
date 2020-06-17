package test2;

public abstract class Vechicle implements EngineStartStop {
	
	private int tankCapacity;
	private int loadingSpace;
	private boolean isEngineOn=false;

	private int sizeOfItemsToLoad;
	
	public Vechicle (int sizeOfItemsToLoad, int loadingSpace) throws LoadingSpaceException {
		this.sizeOfItemsToLoad=sizeOfItemsToLoad;
		if (sizeOfItemsToLoad>loadingSpace) {
			throw new LoadingSpaceException();
		}
	}
	
	
	
	

	
	
	
	
	
	public int getTankCapacity() {
		return tankCapacity;
	}
	public void setTankCapacity(int tankCapacity) {
		this.tankCapacity = tankCapacity;
	}
	public int getLoadingSpace() {
		return loadingSpace;
	}
	public void setLoadingSpace(int loadingSpace) {
		this.loadingSpace = loadingSpace;
	}
	public boolean isEngineOn() {
		return isEngineOn;
	}
	public void setEngineOn(boolean isEngineOn) {
		this.isEngineOn = isEngineOn;
	}

	


	
	
}

