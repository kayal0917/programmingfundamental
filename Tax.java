package com.program;
import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        double grossSalary = getValidDouble(scanner, "Enter your gross salary: ");
		        double totalSavings = getValidDouble(scanner, "Enter your total savings: ");
		        double tax = taxCalculator(grossSalary, totalSavings);
		        System.out.println("Your tax: " + tax);
		        scanner.close();
		    }
		    public static double taxCalculator(double grossSalary, double totalSavings) {
		        double taxableIncome = Math.max(0, grossSalary - Math.min(totalSavings, 100000));
		        double tax = 0;
		        if (taxableIncome > 500000) {
		            tax += (50000 * 0.1) + (300000 * 0.2) + ((taxableIncome - 500000) * 0.3);
		        } else if (taxableIncome > 200000) {
		            tax += (50000 * 0.1) + ((taxableIncome - 200000) * 0.2);
		        } else if (taxableIncome > 100000) {
		            tax += (taxableIncome - 100000) * 0.1;
		        }
		        return tax;
		    }
		    public static double getValidDouble(Scanner scanner, String prompt) {
		        double input;
		        while (true) {
		            System.out.print(prompt);
		            String inputString = scanner.nextLine();
		            try {
		                input = Double.parseDouble(inputString);
		                if (input >= 0) {
		                    break;
		                } else {
		                    System.out.println("Invalid input. Please enter a positive number.");
		                }
		            } catch (NumberFormatException e) {
		                System.out.println("Invalid input. Please enter a valid number.");
		            }
		        }
		        return input;
		    }
		


	}


