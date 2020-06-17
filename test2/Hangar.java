package test2;

import java.util.ArrayList;
import java.util.List;

public class Hangar {

	private int capacity;
	public List vechicles = new ArrayList <>(capacity);
	
	
	public Hangar(int capacity) {
		this.capacity=capacity;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	
	public int getVechiclesSize() {
		return vechicles.size();
	}
	public void addVechicleToList(Vechicle v) throws HangarCapacityException{
		if(getVechiclesSize()<getCapacity())
		{
			vechicles.add(v);
		}
		else {
			throw new HangarCapacityException();
		}
	}
}


