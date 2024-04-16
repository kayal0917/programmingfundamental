package com.program;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Integer {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        long product = 1;

        System.out.println("Enter integers, press 'q' to quit:");

        while (true) {
            String input = scanner.next();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                sum += number;
                product *= number;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter an integer or 'q' to quit.");
            }
        }

        if (count == 0) {
            System.out.println("No numbers entered.");
        } else {
            double average = (double) sum / count;
            System.out.println("Average: " + average);
            System.out.println("Product: " + product);
        }
    }

	private static int parseInt(String input) {
		// TODO Auto-generated method stub
		return 0;
	}


		    }
		

	
		


