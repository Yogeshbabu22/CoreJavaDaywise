package com.destination.augustbatch.sep25;

import java.util.Scanner;

public class UniversalPatternPrinter {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Choose the pattern type:");
	        System.out.println("1. Right Triangle");
	        System.out.println("2. Inverted Triangle");
	        System.out.println("3. Square");
	        System.out.println("4. Diamond");
	        int type = scanner.nextInt();
	        
	        System.out.print("Enter the size of the pattern: ");
	        int size = scanner.nextInt();
	        
	        printPattern(type, size);
	        
	        scanner.close();
	    }

	private static void printPattern(int type, int size) {
		switch (type) {
        case 1: // Right Triangle
            rightTriangle(size);
            break;
        case 2: // Inverted Triangle
            invertedTriangle(size);
            break;
        case 3: // Square
            square(size);
            break;
        case 4: // Diamond
            diamond(size);
            break;
        default:
            System.out.println("Invalid pattern type.");
    }
}
private static void rightTriangle(int size) {
    for (int i = 1; i <= size; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}

private static void invertedTriangle(int size) {
    for (int i = size; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}

private static void square(int size) {
    for (int i = 1; i <= size; i++) {
        for (int j = 1; j <= size; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}

private static void diamond(int size) {
    int n = size / 2;
    for (int i = 0; i <= n; i++) {
        for (int j = n; j > i; j--) {
            System.out.print(" ");
        }
        for (int k = 0; k < i * 2 + 1; k++) {
            System.out.print("*");
        }
        System.out.println();
    }
    for (int i = n - 1; i >= 0; i--) {
        for (int j = n; j > i; j--) {
            System.out.print(" ");
        }
        for (int k = 0; k < i * 2 + 1; k++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
}



