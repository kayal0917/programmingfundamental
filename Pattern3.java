package com.program;

public class Pattern3 {

	public static void main(String[] args) {
        int rows = 4; 
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < rows - i; j++) {
                System.out.print("1");
                if (j != rows - i - 1) {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }


	}


