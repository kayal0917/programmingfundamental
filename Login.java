package com.program;
import java.util.Scanner;
public class Login {

	public static void main(String[] args) {
		String Username = "kayal17";
        String Password = "vizhi17";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        if (username.equals(Username) && password.equals(Password)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Please try again.");
        }

        scanner.close();
	}
}


        