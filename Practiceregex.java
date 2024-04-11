package com.javalearning;

import java.util.regex.Pattern;

public class Practiceregex {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("\\d", "1"));//single digit only
		System.out.println(Pattern.matches("\\d", "1fd")); 
		System.out.println(Pattern.matches("\\D", "m"));//single word on;y
		System.out.println(Pattern.matches("\\D", "hjk"));
		System.out.println(Pattern.matches(".s", "ds"));//end with s 
        System.out.println(Pattern.matches(".s", "djk"));
        System.out.println(Pattern.matches("[amn]", "m")); 
        System.out.println(Pattern.matches("[amn]", "aaaamn"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kayal7"));//length must be six characters
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kayalj17"));
        System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));//starting with 8,10digit number
        System.out.println(Pattern.matches("[789]{1}\\d{9}", "3853038949"));

        

	}

}
