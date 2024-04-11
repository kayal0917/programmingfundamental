package com.javalearning;
import java.util.Scanner;


public class Cabfar {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter the Name:");
		        String name = scanner.next();
		        
		        
		        System.out.println("enter distance");
		        double distance = scanner.nextDouble();
		        System.out.print("Enter Cab Type (Micro/Mini/Prime): ");
		        String cabType;
		        while (true) {
		            cabType = scanner.nextLine().toLowerCase();
		            if (cabType.equals("micro") || cabType.equals("mini") || cabType.equals("prime")) {
		                break;
		            } 
		            } 
		        
		        
		        
		        switch (cabType) {
		            case "micro":
		                Cabfare.cabfaree(distance,10);
		                break;
		            case "mini":
		                Cabfare.cabfaree(distance, 15);
		                break;
		            case "prime":
		                Cabfare.cabfaree(distance, 20);
		                break;
		            default:
		            	System.out.println("Invalid cab type!");
		                return;
		        }
	}
}
		      /*int totalBill;
		       while (true) {
		            if (scanner.hasNextInt()) {
		                totalBill = scanner.nextInt();
		                if (totalBill >= 0) {
		                    break;
		                } else {
		                    System.out.println("Total bill amount cannot be negative. Please enter a valid amount:");
		                }
		            } else {
		                System.out.println("Invalid input. Please enter a valid total bill amount:");
		                scanner.next(); 
		            }
		        }
	}
}
*/
		        
		        
		

	


	    


		

		       
		        
		        


	


