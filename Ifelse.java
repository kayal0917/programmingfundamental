package com.program;
import java.util.Scanner;
public class Ifelse {

	public static void main(String[] args) {
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the x value");
		x=sc.nextInt();
		if(x<0)
		{
			System.out.println("invalid ");//validation
		}
		else if(x>0) {
		System.out.println("X is greater than");
		}
	     else {
		  System.out.println("X is not greater than");
		System.out.println("false");
	     }
		
		
	}

}

