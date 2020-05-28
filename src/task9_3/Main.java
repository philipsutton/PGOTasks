package task9_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Main {
	
	public static void main(String[]args) {
	
	ArrayList<Item> item = new ArrayList<>();
	Map<Integer,String> hm = new HashMap<Integer,String>();	
	HashSet<Item> hs = new HashSet<>();
	
	
	Item i1= new Item (1,"Apple");
	Item i2= new Item (2,"Cola");
	Item i3= new Item (3,"Pasta");
	Item i4= new Item (4,"Fish");
	Item i5= new Item (5,"Beer");
	Item i6= new Item (6,"Meat");
	Item i7= new Item (7,"Water");
	Item i8= new Item (8,"Apple juice");
	Item i9= new Item (9,"Tomatoes");
	Item i10= new Item (10,"Bananas");
	Item i11= new Item (11,"Candy");
	Item i12= new Item (12,"TV");
	Item i13= new Item (13,"Toilet paper");
	Item i14= new Item (14,"Computer mouse");
	Item i15= new Item (15,"Phone charger");
	
	
	item.add(i1);
	item.add(i2);
	item.add(i3);
	item.add(i4);
	item.add(i5);
	item.add(i6);
	item.add(i7);
	item.add(i8);
	item.add(i9);
	item.add(i10);
	item.add(i11);
	item.add(i12);
	item.add(i13);
	item.add(i14);
	item.add(i15);
	
	i1.show();
	i2.show();
	i3.show();
	i4.show();
	i5.show();
	i6.show();
	i7.show();
	i8.show();
	i9.show();
	i10.show();
	i11.show();
	i12.show();
	i13.show();
	i14.show();
	i15.show();
	
	List<Item> firstFive = item.subList(0, 5);
	for(Item i : firstFive) {
		hs.add(i);
		System.out.print(i.getId()+ " ");
		System.out.println(i.getName());
	}
	
	
	
	//for(Item i : item) {
	//	hm.put(i.getId(), i.getName());
	//}
	
	/*for (Map.Entry<Integer,String> entry : hm.entrySet()) {
        System.out.println("ID= " + entry.getKey() +
                ", Name= " + entry.getValue());
	
	}*/
	
	
	
	
}
}