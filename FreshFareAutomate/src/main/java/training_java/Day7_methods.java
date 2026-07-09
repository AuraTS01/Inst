package training_java;
import java.util.Scanner;


public class Day7_methods {
	
	
	
	
//	Modifier --> access Specifier --> Public, Private and Protected
//	static --> Common in all methods
//	Void --> Null 
//	method name
	
	
	public static int add(int a, int b) {
		
	
		
		int c = a + b;
		
		System.out.println(c);
		
		return c;
	} 
	
	
	
	public static void add() {
		
		int a = 10;
		
		int b = 20;
		
		int c = a + b;
		
		System.out.println(c);
		
//		public static void multiply() {
//			
//		}
	}
	
	public static void sub(int p, int q) { //Method Parameterization
		
		
		int a = add(p, q);
		
//		int b = q;
	
		int c = a - q;
		
		System.out.println(c);
	} 
	

	public static void main(String[] args) {
		
		
		Scanner x = new Scanner(System.in);
		
		System.out.println("Enter the value for A: ");
		int a = x.nextInt();  //10
		
		System.out.println("Enter the value for B: ");
		int b = x.nextInt(); //20
		
		
		sub(a, b); // Parameterized value
		
	}

}
