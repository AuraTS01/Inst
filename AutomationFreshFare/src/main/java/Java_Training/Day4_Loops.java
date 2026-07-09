package Java_Training;

import java.util.Scanner;

public class Day4_Loops {

	public static void main(String[] args) {
		
		
		String []name = new String[5]; // --> Single dimensional Array.
//		String []studentname = ["John", "Ram", "Kishore"];
		
//		Syntax:
//		DataType [][]variable =  new DataType[row][column];
		
		Scanner x = new Scanner(System.in);
		
		System.out.println("Enter the value for row: ");
		int row = x.nextInt();
		
		System.out.println("Enter the value for col: ");
		int col = x.nextInt();
		
		int [][]matrixA = new int[row][col];
		int [][]matrixB = new int[row][col];
		int [][]matrixC = new int[row][col];
		
		
		for(int i = 0; i < row; i++) {
			
			for(int j = 0; j < col; j++) {
				
				
				System.out.println("Matrix A[" + i + "][" + j + "]"); 
				matrixA[i][j] = x.nextInt();
				
				System.out.println("Matrix B[" + i + "][" + j + "]"); 
				matrixB[i][j] = x.nextInt();
				
			}
		}
		
		for(int i = 0; i < row; i++) {
			
			for(int j = 0; j < col; j++) {
				
				
				
				matrixC[i][j] = matrixA[i][j] + matrixB[i][j]; 
				
			}
		}
		
		for(int i = 0; i < row; i++) {
			
			for(int j = 0; j < col; j++) {
				
				
				
				System.out.println(matrixC[i][j]);  
				
			}
		}
		

	}

}

//Employee Name and Employee ID
//Designation --> Junior Analyst

//cat = Junior, Senior  --> the count and value
//role = Analyst, Manager --> the count and value

//x = Junior Analyst, Junior Manager, Senior Analyst, Senior Manager --> Make the combination --> Two dimensional Array

//Designation --> Compare with X --> present then the salary should be printed





