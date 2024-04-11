package com.javalearning;
import java.util.Scanner;

public class Kayalreg1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String username, password, email;
        while (true) {
            System.out.print("Enter username: ");
            username = scanner.nextLine();
            if (isValidUsername(username)) {
                System.out.println("Username is valid.");
                break;
            } else {
                System.out.println("Invalid username! Username must be alphanumeric and between 3 to 10 characters.");
            }
        }
        while (true) {
            System.out.print("Enter email: ");
            email = scanner.nextLine();
            if (isValidEmail(email)) {
                System.out.println("Email is valid.");
                break;
            } else {
                System.out.println("Invalid email! Please enter a valid email.");
            }
        }
        while (true) {
            System.out.print("Enter password: ");
            password = scanner.nextLine();
            if (isValidPassword(password)) {
                System.out.println("Password is valid.");
                break;
            } else {
                System.out.println("Invalid password! Password must contain uppercase letter, one digit, and be at least 8 characters long.");
            }
        }
    }
	public static boolean isValidUsername(String username) {
        String pattern = "^[A-Z0-9]{3,10}$";
        return username.matches(pattern);
    }

	public static boolean isValidPassword(String password) {
        String pattern = "^(?=.*[A-Z])(?=.*\\d).{8,}$";
        return password.matches(pattern);
    }
	public static boolean isValidEmail(String email) {
        String pattern = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$";
        return email.matches(pattern);
    }
}

