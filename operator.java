package com.operator;

public class operator {

	public static void main(String[] args) {
//arithmetic operator
	int a=90;//assignment operator
	int b=80;
	int total;
	total=a+b;
	System.out.println("Enter a value="+a);
	System.out.println("Enter b value="+b);
	System.out.println("ADD="+total);
	int tot=a-b;
	System.out.println("SUB="+tot);
	int multi=a*b;
	System.out.println("MULTIPLICATION="+multi);
	int div=a/b;
	System.out.println("DIVISION="+div);
	int mod=a%b;
	System.out.println("MODULE="+mod);
//unary operator
	System.out.println("MINUS="+-a);
    System.out.println(!(a>b));
    System.out.println(!(a<=b));
//relational operator
    System.out.println( a==b);
    System.out.println( a!=b);
//logical operator
    System.out.println((a>b)&&(a<b));
    System.out.println((a>b)||(a<b));
    System.out.println((a>b)&&(a<b));
    



 
    }
	
 
	}

