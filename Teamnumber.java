package com.javalearning;

import java.util.Scanner;

public class Teamnumber {
	public static void main(String[] args) {
		System.out.println(hasTeen(10, 15, 20)); 
        System.out.println(isTeen(13)); 
        System.out.println(isTeen(20)); 
    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        return isTeen(num1) || isTeen(num2) || isTeen(num3);
    }

    public static boolean isTeen(int num) {
        return num >= 13 && num <= 19;
    }

        
    }


    



	


