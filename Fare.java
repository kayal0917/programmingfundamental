package com.javalearning;
import java.util.Scanner;

public class Fare {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter the km: ");
		        int distance;
		        while (true) {
		            if (scanner.hasNextInt()) {
		                distance = scanner.nextInt();
		                if (distance >= 0) {
		                    break;
		                } else {
		                    System.out.println("Distance cannot be negative. Please enter a valid distance:");
		                }
		             
		            }
		        }
	}
}
		        
	



	


