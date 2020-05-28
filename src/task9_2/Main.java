package task9_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[]args) {
	
	ArrayList<Item> item = new ArrayList<>();
	Map<Integer,String> hm = new HashMap<Integer,String>();	
	
	
	Item i1= new Item (1,"Apple");
	Item i2= new Item (2,"Cola");
	Item i3= new Item (3,"Pasta");
	Item i4= new Item (4,"Fish");
	Item i5= new Item (5,"Beer");
	
	item.add(i1);
	item.add(i2);
	item.add(i3);
	item.add(i4);
	item.add(i5);
	
	i1.show();
	i2.show();
	i3.show();
	i4.show();
	i5.show();
	
	for(Item i : item) {
		hm.put(i.getId(), i.getName());
	}
	
	for (Map.Entry<Integer,String> entry : hm.entrySet()) {
        System.out.println("ID= " + entry.getKey() +
                ", Name= " + entry.getValue());
	
	}
	
	
}
}