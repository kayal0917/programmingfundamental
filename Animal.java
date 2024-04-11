package com.javalearning;

import java.util.Scanner;

public class Animal {

	public static void main(String[] args) {
		int legs=4;
		int clows;
		boolean hastail;
		int sense;
		char group;
		char habitat='d';
		legs=5;
		System.out.println("Leg:="+legs);
		System.out.println("Habitat:"+habitat);
		Scanner sc = new Scanner(System.in);
		{
		System.out.println("please enter the animal sense");
		sense = sc.nextInt();
		System.out.println("please enter name of your pet");
	    String name=sc.next();
		System.out.println("Animal sense:"+sense);
        System.out.println(name+"nice name");
		}
	    
		
		
		
        
	}

}
