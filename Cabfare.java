package com.javalearning;

import java.util.Scanner;

public class Cabfare {

	
	    public static void cabfaree(double distance, int kilometer) {
	    Scanner sc = new Scanner(System.in);
	    double cabFare = distance*kilometer;
	    System.out.println("Cab Fare:Rs."+cabFare);
	    System.out.print("Enter total bill amount:");
	    int amount = sc.nextInt();
	    double discount=0;
	    if (amount> 5000) 
	    {
	        discount = amount*0.05;
	    } 
	    else if (amount > 2000) 
	    {
	        discount = amount*0.02; 
	    }
	    System.out.println("Discount applied:Rs."+discount);
	    double finalBill= amount-discount;
	    System.out.println("Final bill after discount:Rs."+finalBill);

	}
	}

