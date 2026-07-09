package JavaTraining;

import java.util.Scanner;

public class Day6_Methods {
	
//	Methods --> a functional block --> try to execute the code
	
	
//	1. general Methods
//	2. Method Parameterization
//	3. Method Overloading
//	4. Method Overriding
	
	
//	Modifiers --> Public, private, protected --> Controlling keyword
//	static --> 
//	void --> Null --> it has some value but cannot be utilized
//	Method Name 
	
	
	public static int add(int p, int q) { //paramter
		
		
		
		int c = p + q;
		
		System.out.println(c);
		
		return c; 
	}
	
	public static void add() {
		
	}
	
	public static void sub(int x, int y) {
		
		
		int a = add(x, y);
		int b = y;
		
		int c = a - b;
		
		System.out.println(c);
		
		
		
	}
	

	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		
		
		String name = "John";
		
		
		System.out.println("Enter the value for A: ");
		int a = x.nextInt();
		
		System.out.println("Enter the value for B: ");
		int b = x.nextInt();
		
		sub(a, b); // Parameterized Value

	}

}
