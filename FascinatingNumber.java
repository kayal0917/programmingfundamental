package com.program;
import java.util.Scanner;
public class FascinatingNumber {
            public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        int num;
		        do {
		            System.out.print("Enter a three-digit number: ");
		            while (!scanner.hasNextInt()) {
		                System.out.println("Invalid input. Please enter a valid integer.");
		                System.out.print("Enter a three-digit number: ");
		                scanner.next();
		            }
		            num = scanner.nextInt();
		        } while (num < 100 || num > 999); 

		        if (isFascinating(num)) {
		            System.out.println(num + " is a fascinating number.");
		        } else {
		            System.out.println(num + " is not a fascinating number.");
		        }
		        scanner.close();
		    }
		    public static boolean isFascinating(int num) {
		        int multiple1 = num * 2;
		        int multiple2 = num * 3;
		        String concatenated = String.valueOf(num) + String.valueOf(multiple1) + String.valueOf(multiple2);
		        return concatenated.length() == 9 && concatenated.matches("^[1-9]{9}$");
    	    }
    	
}


            
            	
            	        
