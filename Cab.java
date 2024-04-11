package com.javalearning;

import java.util.Scanner;

public class Cab {
	public static void main(String[] args) { 

		        Scanner scanner = new Scanner(System.in);


		                Scanner scanner = new Scanner(System.in);

		                String name = getName(scanner);

		                int distance = getDistance(scanner);
		                String cabType = getCabType(scanner);

		                int cabFare = calculateCabFare(distance, cabType);
		                displayCabFare(cabFare);

		                int totalBill = getTotalBill(scanner);

		                double discountAmount = calculateDiscount(totalBill);
		                displayDiscount(discountAmount);

		                double finalAmount = applyDiscount(totalBill, discountAmount);
		                displayFinalAmount(finalAmount);

		                scanner.close();
		            }

		            public static String getName(Scanner scanner) {
		                System.out.print("Enter your name: ");
		                return scanner.nextLine();
		            }

		            public static int getDistance(Scanner scanner) {
		                System.out.print("Enter the km: ");
		                return scanner.nextInt();
		            }

		            public static String getCabType(Scanner scanner) {
		                scanner.nextLine(); 
		                System.out.print("Enter Cab Type (Micro/Mini/Prime): ");
		                return scanner.nextLine();
		            }

		            public static int calculateCabFare(int distance, String cabType) {
		                int ratePerKm;
		                switch (cabType.toLowerCase()) {
		                    case "micro":
		                        ratePerKm = 10;
		                        break;
		                    case "mini":
		                        ratePerKm = 15;
		                        break;
		                    case "prime":
		                        ratePerKm = 20;
		                        break;
		                    default:
		                        System.out.println("Invalid cab type!");
		                        return 0;
		                }
		                return distance * ratePerKm;
		            }

		            public static void displayCabFare(int cabFare) {
		                System.out.println("Cab Fare: Rs." + cabFare);
		            }

		            public static int getTotalBill(Scanner scanner) {
		                System.out.print("Enter total bill amount: Rs.");
		                return scanner.nextInt();
		            }

		            public static double calculateDiscount(int totalBill) {
		                double discountPercentage;
		                if (totalBill > 5000) {
		                    discountPercentage = 0.05; 
		                } else if (totalBill > 2000) {
		                    discountPercentage = 0.02; 
		                } else {
		                    discountPercentage = 0; 
		                }
		                return totalBill * discountPercentage;
		            }

		            public static void displayDiscount(double discountAmount) {
		                System.out.println("Discount Amount: Rs." + discountAmount);
		            }

		            public static double applyDiscount(int totalBill, double discountAmount) {
		                return totalBill - discountAmount;
		            }

		            public static void displayFinalAmount(double finalAmount) {
		                System.out.println("Final Amount to be Paid: Rs." + finalAmount);
		            }
		        

		    }
		


	}


