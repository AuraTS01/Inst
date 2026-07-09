package JavaTraining;

import java.util.Scanner;

public class Day5_Arrays {

	public static void main(String[] args) {
		
		
//		two Dimensional Array.
		
		Scanner x = new Scanner(System.in);
		
		int []a = new int[5];
		
//		Syntax:
//		DataType [][]variable = new DataType[row][col];
		
		System.out.println("Enter the row value: ");
		int row = x.nextInt();

		
		System.out.println("Enter the col value: ");
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


//1. Write a code for three dimensional Array
//2. 

//Test Lead

//Cat = lead, Senior --> get the inputs
//role = QA, Developer --> get the input

//x = QA Lead, Senior QA, Developer Lead, Senior Developer --> Make the combination --> 2 dimensional Array

//Employee Name, Employee ID
//Designation = QA Lead --> Compare with X 

//get the salary for the designation







