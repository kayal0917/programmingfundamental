package com.program;
import java.util.Scanner;    
public class Shopdiscount {
	    public static void main(String[] args) {
	        int quantity;
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Enter the quantity:");
	        quantity=sc.nextInt();
	        int cost=100;
	        int totalCost=quantity*cost;
	        if(totalCost>=1000)
	        {
	        	System.out.println("INVALID DATA");//validation
	        }
	        else if(totalCost<1000)
	        {
	            totalCost=(int) (totalCost-0.1*totalCost);
	            System.out.println("your total cost is with 10% discount"+totalCost);
	        }
	        
	        else
	        {
	            System.out.println("your total cost is "+totalCost);
	        }
	        

	    }
}
