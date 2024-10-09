package com.destination.augustbatch.sep25;

import java.util.Scanner;

public class HeartPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the heart : ");
        int size = scanner.nextInt();

        // Ensure the size is even for symmetry
        if (size % 2 != 0) {
            size++;
        }

        printHeart(size);
    }

    public static void printHeart(int size) {
        
        for (int i = size / 2; i <= size; i += 2) {
            // Print leading spaces
            for (int j = 1; j < size - i; j += 2) {
                System.out.print(" ");
            }

            
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }

     
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

         
            System.out.println();
        }


        for (int i = size; i >= 1; i--) {
            // Print leading spaces
            for (int j = i; j < size; j++) {
                System.out.print(" ");
            }


            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }


            System.out.println();

		}
		// TODO Auto-generated method stub

	}

}
