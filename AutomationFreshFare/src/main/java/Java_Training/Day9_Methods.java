package Java_Training;

import java.util.Scanner;

public class Day9_Methods {
	
	
	static int a, b, c; // --> Attributes or global variables

	
	public static int add(int a, int b) {
		
		
		String name = "John";
		
		
		c = a + b;
		
		System.out.println(c);
		
		return c;
		
		
//		public static void multiply() {
//			
//		}
	}
	
	public static void add() {
		Scanner x = new Scanner(System.in);
		
		
		a = x.nextInt();
		
		b = x.nextInt();
		
		c = a + b;
		
		System.out.println(c);	
		
	}
	
	
	
	public static void sub(int x, int y) {
		
//		Scanner x = new Scanner(System.in);
		
		
		
//		System.out.println("Enter the value for A: ");
		 a = add(x, y);
		
//		System.out.println("Enter the value for B: ");
		b = y;
		
		c = a - b;
		
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		
		Scanner x = new Scanner(System.in);
		
		
		System.out.println("Enter the value for A: ");
		a = x.nextInt(); 
		
		System.out.println("Enter the value for B: ");
		b = x.nextInt();
	
		sub(a, b);
	}

}
