package com.destination.septemberbatch.oct1;


	import java.util.Scanner;

	public class JaggedArrayInput {
	    public static void main(String[] args) {
	        
	        int[][] array = new int[6][];

	        array[0] = new int[3];
	        array[1] = new int[2];
	        array[2] = new int[2]; 
	        array[3] = new int[3];
	        array[4] = new int[2]; 
	        array[5] = new int[2]; 

	        Scanner scanner = new Scanner(System.in);

	      
	        System.out.println("Enter values for the 2D jagged array:");

	      
	        for (int i = 0; i < array.length; i++) {
	            for (int j = 0; j < array[i].length; j++) {
	                System.out.print("Enter value for array[" + i + "][" + j + "]: ");
	                array[i][j] = scanner.nextInt();
	            }
	        }

	      
	        System.out.println("\nThe entered jagged 2D array is:");
	        for (int i = 0; i < array.length; i++) {
	            for (int j = 0; j < array[i].length; j++) {
	                System.out.print(array[i][j] + "\t");
	            }
	            System.out.println(); 
	        }

	   
	}
	}

