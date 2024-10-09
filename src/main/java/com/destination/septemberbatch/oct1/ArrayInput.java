package com.destination.septemberbatch.oct1;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        
        int[][] array = new int[6][3];
        
        System.out.println("Enter the values for the 2D array:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter values for the 2D Array : ");
        for (int i = 0; i < 6; i++) {
        	System.out.println("Enter values for rows " + (i +1) + ":");
            for (int j = 0; j < 3; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println( "\nThe entered 2D Array is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
               System.out.println(array[i][j] + "\t");
            }
            System.out.println();
        
        }
        scanner.close();
    }
        

    	
    }
        
       
     





