package training_java;


import java.util.Scanner;

public class day1_basics {

	public static void main(String[] args) {
		
		
		Scanner x = new Scanner(System.in);
		
		
//		Declaration --> DataType and Variable
		
//		DataType --> Reserved words or keywords
		
//		ASCII VALUE --> storage value
		
		
//		int --> 2345678901 --> 9876543210
//		int --> number 
//		
//		String --> text --> letter or word or sentence or paragraph
//		
//		double --> decimal values
//		
//		long --> long int
		
		
//		Variable -->  to store the value
		
		System.out.println("Enter the value for A: ");
		int a = x.nextInt();
		
		System.out.println("Enter the value for B: ");
		int b = x.nextInt();
		
		String stud_name =  "John";
		
		
		System.out.println(stud_name);
		System.out.println(stud_name);

		
//		Operators --> to perform some operations
		
//		1. Arithmetic -->+, -, *, /, %
//		2. logical --> &&(AND), ||(OR), !(NOT)
//		3. Comparison --> <,>,<=,>=, ==, !=
		
		int c = a + b;
		
		System.out.println(c);
		
		
//		Loops --> to perform certain action for certain iteration until the condition is satisfied
		
//		1. if  --> general if, if else, else if, nested if
//		2. for
//		3. while
//		4. do..while
		
		
		
//		Syntax: --> Declaration --> understand by machine
//		if(condition) {
//			
//		}

		if(c > 50) {
			System.out.println("C is greater than 50");
		}else if(c < 25) {
			System.out.println("C is lesser than 25");
		}
		else {
			System.out.println("C is equal to 50");
		}
		
		
//1. get the input from the user for multiple Student name, student id, student 5 sub marks and calculate the average and print the student is pass 
//or fail
//2. Get the input from the user for multiple employee name, employee id, employee designation and calculate the salary based on designation
		
		
		
		
		
		
		
		
		
	}

}
