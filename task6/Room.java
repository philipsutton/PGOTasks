package task6;

import java.util.ArrayList;

public class Room {
	
	private double area;
	ArrayList<Furniture>furniture=new ArrayList<>();	
	
	public void add(Furniture f){
        furniture.add(f);
    }
	
	public Room() {
		
	}
	
	public int  getWholePrice() {
		int x=0;
		for(int i=0;i<furniture.size();i++) {
			x+=furniture.get(i).getPrice(false);
		}
		return x;
	}
	
	public Room(double area) {
		this.area=area;
	}

}
