package com.program;

public class LogicalOperator {

	public static void main(String[] args) {
        int x = 5;
        System.out.println(x > 3 && x < 10);
        System.out.println(x > 3 || x < 10);
        System.out.println(!(x > 3 && x < 10));
        System.out.println(x <= 3 || x < 10);
        System.out.println(x > 3 && x >= 10);
        System.out.println(x == 3 || x < 10);
	}
}
