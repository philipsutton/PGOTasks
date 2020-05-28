package task9;

import java.util.ArrayList;
import java.util.Collections;


public class Main {

	public static void main(String[] args) {
		
		ArrayList<Car> cars = new ArrayList<>();
		
		Car c1 = new Car("Suzuki Swift", 1999);
		Car c2 = new Car("BMW E36", 1997);
		Car c3 = new Car("VOLVO 940", 1995);
		Car c4 = new Car("Toyota AE86", 1986);
		Car c5 = new Car("Lexus IS200", 2003);
		Car c6 = new Car("Alfa Romeo Mito", 2009);
		Car c7 = new Car("Opel Corsa", 2010);
		Car c8 = new Car("Dacia Duster", 2014);
		Car c9 = new Car("Toyota GT86", 2012);
		Car c10 = new Car("Nissan Almera", 2002);
		
		cars.add(c1);
		cars.add(c2);
		cars.add(c3);
		cars.add(c4);
		cars.add(c5);
		cars.add(c6);
		cars.add(c7);
		cars.add(c8);
		cars.add(c9);
		cars.add(c10);
		
		 Collections.sort(cars);

	        for(Car c : cars){
	            System.out.println(c);
	        }
		
		}
		
		
		}


	
	


