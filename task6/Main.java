package task6;

public class Main {

	public static void main(String[] args) {
		
		
		House house=House.createHouse("House1");

	        Room r1 = new Room(55);
	        Room r2 = new Room(32);
	        Room r3 = new Room(86);

	        house.addRoom(r1);
	        house.addRoom(r2);
	        house.addRoom(r3);
	   

	        Furniture f1 = new Furniture("Chair", 200);
	        Furniture f2 = new Furniture("Cupboard", 750);
	        Furniture f3 = new Furniture("Desk", 1200);
	        Furniture f4 = new Furniture("Sofa", 2500);
	        f1.getPrice(true); 
	      

	        r1.add(f1);
	        r1.add(f2);
	        r2.add(f3);
	        r3.add(f4);
	        
	        int wholePriceAllRooms = r1.getWholePrice() + r2.getWholePrice() + r3.getWholePrice();	
	        
	        System.out.println("Your consists of " + house.addRoomCounter() + " rooms");
	        System.out.println("The cost of your furniture is " + wholePriceAllRooms + " PLN");

	}

}
