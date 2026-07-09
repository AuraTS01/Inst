package JavaTraining;

import java.util.Scanner;
import JavaTraining.day7_contructors;


public class Day9_OOPS {

	
	
	static int a, b, c = 35; // Attributes or Global Variables
	private static String name;
	
	static day7_contructors con;
	
	Day9_OOPS(){
		
		con = new day7_contructors(1,3);
	}
	
	public static int add() { //paramter
		
		
		
		c = a + b;
		
		System.out.println(c);
		
		return c; 
	}
	

	
	private static void sub() {
		
		
		a = add();
//		b = y;
		
		c = a - b;
		
		System.out.println(c);
		
		
		System.out.println(name);
		
		con.add();
		
		
	}
	

	public static void main(String[] args) {
		
		
		
		
		Scanner x = new Scanner(System.in);
		
		
		name = "John";
		
		
		System.out.println("Enter the value for A: ");
		a = x.nextInt();
		
		System.out.println("Enter the value for B: ");
		b = x.nextInt();
		
		
		Day9_OOPS y = new Day9_OOPS(a, b);
//		
		sub(); // Parameterized Value

	}


}

class training extends Day9_OOPS{
	
	public static void printvalues() {
		
		day7_contructors con =  new day7_contructors(1,2);
		add();
		
//		o.name = "Prashanth";
//		o.
	}
	
	
}
