package task9;



public class Car implements Comparable <Car> {

    private String name;
    private int year;

    public Car (String name, int year){
        this.name=name;
        this.year=year;
    }

    @Override
    public int compareTo(Car c) {
        return this.year - c.year;
    }

    @Override
    public String toString(){
        return name;
    }
}