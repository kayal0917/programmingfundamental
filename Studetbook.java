package com.book;

import java.util.Scanner;

public class Studetbook {

	public static void main(String[] args) {
		String bookname;
		String author;
		int pagenumber=150;
		char row;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the book name");
	    bookname=sc.next();
	    System.out.println("Enter the author");
	    author=sc.next();
	    System.out.println("pagenumber:"+pagenumber);
	    System.out.println("Enter the row");
	    row=sc.next().charAt(0);
	    System.out.println("ROW:"+row);
	    
		
		
		
		
	}

}
