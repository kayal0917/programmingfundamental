package com.program;

import java.util.Scanner;

public class Evendigit {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            System.out.print("Enter a positive integer: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive integer.");
                }
            } else {
                System.out.println("Invalid input.");
                scanner.next(); // validation
            }
        }

        System.out.print("List of even numbers from 1 to " + number + ": ");
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
	  
	}

