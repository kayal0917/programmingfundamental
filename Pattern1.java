package com.program;

import java.util.Scanner;

public class Pattern1{

	public static void main(String[] args) {
		int n,i,j;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
        if(n<0)
        {
        	System.out.println("invalid input");//validation
        }
        for(i=1;i<=n;i++)
        {
            for(j=1;i>=j;j++)
            {
                System.out.print("*");
            }
            System.out.println("\n");
        }

    }


	}


