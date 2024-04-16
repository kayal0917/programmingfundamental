package com.program;

public class Pattern2 {

	public static void main(String[] args) {

		        int size = 5; // Change the size as needed

		        // Upper part of the pattern
		        for (int i = 1; i <= size; i++) {
		            // Print spaces
		            for (int j = 1; j <= size - i; j++) {
		                System.out.print(" ");
		            }
		            // Print asterisks
		            for (int k = 1; k <= 2 * i - 1; k++) {
		                System.out.print("*");
		            }
		            System.out.println();
		        }

		        // Lower part of the pattern
		        for (int i = size - 1; i >= 1; i--) {
		            // Print spaces
		            for (int j = 1; j <= size - i; j++) {
		                System.out.print(" ");
		            }
		            // Print asterisks
		            for (int k = 1; k <= 2 * i - 1; k++) {
		                System.out.print("*");
		            }
		            System.out.println();
		        }
		    }
		

	}

