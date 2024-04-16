package com.program;
import java.util.Scanner;
public class Sumofdigit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if(number<0)
        {
        	System.out.println("invalid input");//validation
        }
        int sum = 0;
        int temp = number;
        while (temp > 0) {
        	{
            sum += temp % 10;
            temp /= 10;
        }
       
	    }
        System.out.println("Sum of digits: " + sum);
        scanner.close();
    }
}



        
        
        
        
        
        
        



	

	
		        