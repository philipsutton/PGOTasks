package task6;

import java.util.ArrayList;

public class House {
    
	ArrayList<Room> rooms = new ArrayList<>();
    String address;
    public static House house = new House(" ");

   
    private House(String address){
        this.address=address;
    }

   
    public void addRoom(Room r){
        rooms.add(r);
    }

   
    public void addRooms(ArrayList<Room> r){
   
    	for(int i=0;i<r.size();i++){
            rooms.add(r.get(i));
        }
    }

   
    public static House createHouse(String a1) {
        house.address=a1;
        return house;
    }

  
    public int addRoomCounter(){
        int roomCount=0;
        for(int i=0; i<rooms.size(); i++){
            roomCount+=1;
        }
       return roomCount;
    }
}
