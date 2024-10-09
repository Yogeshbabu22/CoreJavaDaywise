package com.destination.augustbatch.sep25;

public class StarPatternYogesh {

	public static void main(String[] args) {
		 String name = "YOGESH";
	        int n = 5; // The size of the star pattern (5x5)
	        
	        // Loop through each row of the pattern
	        for (int i = 0; i < n; i++) {
	            // Print each letter of the name in one row
	            for (char letter : name.toCharArray()) {
	                printPattern(letter, i);
	                System.out.print("  "); // Space between letters
	            }
	            System.out.println(); // Move to the next line after each row
	        }
	    }

	    // This function will print the respective row of a given letter's pattern
	    public static void printPattern(char ch, int row) {
	        switch (ch) {
	            case 'Y':
	                printY(row);
	                break;
	            case 'O':
	                printO(row);
	                break;
	            case 'G':
	                printG(row);
	                break;
	            case 'E':
	                printE(row);
	                break;
	            case 'S':
	                printS(row);
	                break;
	            case 'H':
	                printH(row);
	                break;
	        }
	    }

	    // Methods for each letter pattern
	    public static void printY(int row) {
	        for (int j = 0; j < 5; j++) {
	            if ((row == j && row < 3) || (row + j == 4 && row < 3) || (row >= 3 && j == 2))
	                System.out.print("*");
	            else
	                System.out.print(" ");
	        }
	    }

	    public static void printO(int row) {
	        for (int j = 0; j < 5; j++) {
	            if ((row == 0 && j > 0 && j < 4) || (row == 4 && j > 0 && j < 4) || (j == 0 && row > 0 && row < 4) || (j == 4 && row > 0 && row < 4))
	                System.out.print("*");
	            else
	                System.out.print(" ");
	        }
	    }

	    public static void printG(int row) {
	        for (int j = 0; j < 5; j++) {
	            if ((row == 0 && j > 0 && j < 4) || (row == 4 && j > 0 && j < 4) || (j == 0 && row > 0 && row < 4) || (j == 4 && row >= 2) || (row == 2 && j >= 2))
	                System.out.print("*");
	            else
	                System.out.print(" ");
	        }
	    }

	    public static void printE(int row) {
	        for (int j = 0; j < 5; j++) {
	            if (j == 0 || row == 0 || row == 2 || row == 4)
	                System.out.print("*");
	            else
	                System.out.print(" ");
	        }
	    }

	    public static void printS(int row) {
	        for (int j = 0; j < 5; j++) {
	            if ((row == 0 && j > 0 && j < 4) || (row == 2 && j > 0 && j < 4) || (row == 4 && j > 0 && j < 4) || (j == 0 && row < 2) || (j == 4 && row > 2))
	                System.out.print("*");
	            else
	                System.out.print(" ");
	        }
	    }

	    public static void printH(int row) {
	        for (int j = 0; j < 5; j++) {
	            if (j == 0 || j == 4 || row == 2)
	                System.out.print("*");
	            else
	                System.out.print(" ");
	        }

    }

		// TODO Auto-generated method stub

	}


