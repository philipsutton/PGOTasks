package task9_4;

import java.util.Scanner;

public class Main {
	
	public static void main (String[]args) {
		
		readNumber();
		fillArray();
		
		
	}
	
	
	static int tab[] = new int[10];
	static Scanner x = new Scanner(System.in);
	static int y=0;

	
	public static int readNumber() throws NegativeNumberException {
		
		System.out.println("Number: ");
		y=x.nextInt();
		if(y<0) {
			throw new NegativeNumberException("Negative numbers are not allowed ");
		}
		
		else {
			return y;
		}
	}
	
	
	public static void fillArray() {
		if(y<0) {
			for(int a : tab ) {
				tab[a]=0;
				throw new NegativeNumberException("Cannot be smaller than zero ");
			}
		}
		
		for(int l : tab){
            System.out.print(tab[l]);
            System.out.print(" ");
        }
	}

}
