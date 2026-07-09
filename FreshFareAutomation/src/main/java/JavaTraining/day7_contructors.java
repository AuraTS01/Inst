package JavaTraining;

import java.util.Scanner;

public class day7_contructors {
	
	
//	Modifier --> Public, Private, Protected.
//	Class keyword
//	class Name
	
	
//	OOPS --> Object Oriented Programming Structure
//	
//	1. Classes
//	2. Objects
//	3. Inheritance
//	4. Polymorphism
//	5. Abstraction
//	6. Encapsulation
	
	
//	Public --> 
//	Private --> Mobile phone --> It can be accessed only within the class
//	Protected --> Car --> It can be accessed within your package
	
	
	
	
	static int a, b, c = 35; // Attributes or Global Variables
	private static String name;

	
	day7_contructors(int y, int u){
		
		System.out.println("Hi This is called First");
		
		a = y; 
		b = u;
		
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
		
		
	}
	

	public static void main(String[] args) {
		
		
		
		
		Scanner x = new Scanner(System.in);
		
		
		name = "John";
		
		
		System.out.println("Enter the value for A: ");
		a = x.nextInt();
		
		System.out.println("Enter the value for B: ");
		b = x.nextInt();
		
		
		day7_contructors y = new day7_contructors(a, b);
//		
		sub(); // Parameterized Value

	}


}

class demo{
	
	public static void printvalues() {
		
		day7_contructors o = new day7_contructors(1,2);
		
		o.name = "Prashanth";
		o.
	}
	
	
}
