package Java_Training;

import java.util.Scanner;

public class Day8_Methods {
	
	
//	public --> Modifier --> Public, Private, Protected
//	static -- > Constant
//	Void --> Return Type --> Null or nothing --> You can use it, but you cannot make the purpose 
//	main --> Method name
	
	
	public static void add() {
		
		Scanner x = new Scanner(System.in);
		
		System.out.println("Enter the value for A: ");
		int a = x.nextInt(); 
		
		System.out.println("Enter the value for B: ");
		int b = x.nextInt();
		
		int c = a + b;
		
		System.out.println(c);
	}
	
	public static void sub() {
		
		Scanner x = new Scanner(System.in);
		
		add();
		
		System.out.println("Enter the value for A: ");
		int a = x.nextInt(); 
		
		System.out.println("Enter the value for B: ");
		int b = x.nextInt();
		
		int c = a - b;
		
		System.out.println(c);
	}
	
//	General Methods , Method parameterization, Method Overloading, method Overriding

	public static void main(String[] args) {
		
		
		sub();
	}

}
