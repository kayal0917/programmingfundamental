package com.operator;

import java.util.Scanner;

public class operator1 {

	public static void main(String[] args) {
	String name;
	int tamilmark;
	int englishmark;
	int mathsmark;
	int sciencemark;
	int socialmark;
	int total;
	Scanner sc = new Scanner(System.in);
    tamilmark=sc.nextInt();
	System.out.println("Tamil:"+tamilmark);
	englishmark=sc.nextInt();
	System.out.println("English:"+englishmark);
	mathsmark=sc.nextInt();
	System.out.println("Maths:"+mathsmark);
	sciencemark=sc.nextInt();
	System.out.println("Science:"+sciencemark);
	socialmark=sc.nextInt();
	System.out.println("Social:"+socialmark);
	total=tamilmark+englishmark+mathsmark+sciencemark+socialmark;
	System.out.println("Total is:"+total);
	int avg=total/5;
	System.out.println("Average is:"+avg);
	if((avg>=95)&&(avg>=90))
    {
        System.out.println("A");
    }
    else if((avg>=89)&&(avg<=80))
    {
        System.out.println("B");
    }
    else if((avg>=79)&&(avg<=70))
    {
        System.out.println("c");
    }
    else {
        System.out.println("GOOD");
    }
	
	}

}
