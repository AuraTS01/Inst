package training_java;

import java.util.Scanner;

public class day8_Attributes_Constructors {
	
	
	
	static  int a,b, c = 0;  // --> Attribute or global variable
	
	day8_Attributes_Constructors(int q, int w){
		
		
		a = q;
		
		b = w;
		
	}
	
	

	public static void add(int a, int b) {
		
	
		
		c = a + b;
		
		System.out.println(c);
		
		
	} 
	
	
	
	
	public static void sub(int p, int q) { //Method Parameterization
		
		add(p, q);
		
		
		int a = c;
		
//		int b = q;
	
		c = a - b;
		
		System.out.println(c);
	} 
	

	public static void main(String[] args) {
		
		
		
		
		
		Scanner x = new Scanner(System.in);
		
		System.out.println("Enter the value for A: ");
		a = x.nextInt();  //10
		
		System.out.println("Enter the value for B: ");
		b = x.nextInt(); //20
		
		day8_Attributes_Constructors dy = new day8_Attributes_Constructors(a, b) ;
		
		
		sub(a, b); // Parameterized value
		
	}

}
