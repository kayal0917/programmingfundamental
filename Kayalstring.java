package com.javalearning;
public class Kayalstring {
	public static void main(String[] args) {
		String helloworld;
        String str = "   Hello, World!   ";
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase()); 
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Trimmed: " + str.trim()); 
        System.out.println("Replaced: " + str.replace("World", "Universe")); 
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello")); 			        System.out.println("Ends with 'World!': " + str.endsWith("World!")); // Output: false
        System.out.println("Character at index 4: " + str.charAt(4)); 
        System.out.println("Index of 'World': " + str.indexOf("World"));
        String a= "Java is a widely-used programming language for coding web applications";
        String b= a.replace("Java", "kava");
        System.out.println(b);
        String c="javatpoint";  
        System.out.println(c.substring(2,4));
        System.out.println(c.substring(2));
        String d=" He is superior than you in strength";
        System.out.println(d.indexOf('t'));
        String str1 = "kAyAl";
        String str2 = "KaYaL";
        str2.equalsIgnoreCase(str1);

		
		            			    }
			
	}


    





		    	
		    	
		    	        	


