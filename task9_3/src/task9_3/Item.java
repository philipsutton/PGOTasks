package task9_3;

public class Item {
	private int ID;
	private String name;
	
	public Item(int ID, String name) {
		this.ID=ID;
		this.name=name;
	}
	
	public int getId() {
		return ID;
	}
	
	public void setId() {
		this.ID=ID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName() {
		this.name=name;
	}
	
	
	public void show() {
		System.out.println(this.name);
	}
	
}
