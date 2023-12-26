package com.expandtesting;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        while (true) {
            System.out.println("Choose operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            if (choice == 3) {
                System.out.println("Exiting the calculator app. Goodbye!");
                break;
            }

            System.out.println("Enter first number:");
            int num1 = scanner.nextInt();

            System.out.println("Enter second number:");
            int num2 = scanner.nextInt();

            switch (choice) {
                case 1:
                    result = calculator.add(num1, num2);
                    System.out.println("Result of addition: " + result);
                    break;
                case 2:
                    result = calculator.subtract(num1, num2);
                    System.out.println("Result of subtraction: " + result);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }

        scanner.close();
    }
}
