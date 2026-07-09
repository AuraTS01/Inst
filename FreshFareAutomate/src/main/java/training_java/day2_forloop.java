package training_java;

import java.util.Scanner;

public class day2_forloop {

	public static void main(String[] args) {
		
		Scanner y = new Scanner(System.in);
		
//		Syntax:
		
//		for(initialize / Declaration; condition; increment/decrement) {
//			
//		}

		
//		increment --> i++ or ++i --> i+1 or 1+i
//		Decrement --> i-- or --i --> i-1 or 1-i
		
//		int  a = 10, 20, 30, 40, 50;
		
//		for(int i = 1; i < 5; i++) {  // i =1, i =2, i =3, i = 4, i =5
//			
//			System.out.println(i);		
//		}
//		
//		Arrays --> which help to store multiple values into a single variable
		
//		syntax: Data type [] variable = new Data Type[count]
		
//		Data type [][] variable = new Data Type[row][col]
		
		int []a = new int[5]; // Single Dimensional Array
		
		String []name = new String[2];
		
//		for(int i = 0; i < 5; i++) {
//			
//			System.out.println("A[" + i + "]");
//			a[i] = y.nextInt();
//		}
		int row = 2;
		int col = 2;
		
		int [][]b = new int[row][col];
		
		
		for(int i = 0; i < row; i++) { //row
			
			for(int j =0; j < col; j++) { //col
				
				System.out.println("B[" + i + "][" + j + "]");
				b[i][j] = y.nextInt();
				
			}
		}
		
		
		
		
		
		
		
	}

}




//Employee name 
//Employee id
//Designation =  Senior production Engineer

// Category = Senior, Junior --> get the data from the user
// Role = Test Engineer, development Engineer --> get the data from user



//X = Senior Test Engineer, Junior Test Engineer, Junior Development Engineer, Senior Development Engineer









