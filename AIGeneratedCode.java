import java.util.Scanner;

public class AIGeneratedCode {

    // Method to add two numbers
    public static int add(int a, int b) {
        // Adding the numbers
        return a + b;
    }

    // Method to subtract two numbers
    public static int subtract(int a, int b) {
        // Subtracting the numbers
        return a - b;
    }

    // Method to multiply two numbers
    public static int multiply(int a, int b) {
        // Multiplying the numbers
        return a * b;
    }

    // Method to divide two numbers
    public static double divide(int a, int b) {
        // Dividing the numbers
        if (b == 0) {
            // Avoiding division by zero
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return (double) a / b;
    }

    // Method to print a greeting message
    public static void printGreeting() {
        System.out.println("Hello! Welcome to the AI-generated program!");
    }

    // Method to print the menu options
    public static void printMenu() {
        System.out.println("Please choose an option:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Printing the greeting
        printGreeting();
        
        // Printing the menu
        printMenu();
        
        // Taking user input for the operation choice
        int choice = scanner.nextInt();
        
        // Asking for two numbers to perform the operation on
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();
        
        // Performing the operation based on user input
        if (choice == 1) {
            int result = add(num1, num2);
            System.out.println("The result of adding is: " + result);
        } else if (choice == 2) {
            int result = subtract(num1, num2);
            System.out.println("The result of subtracting is: " + result);
        } else if (choice == 3) {
            int result = multiply(num1, num2);
            System.out.println("The result of multiplying is: " + result);
        } else if (choice == 4) {
            double result = divide(num1, num2);
            System.out.println("The result of dividing is: " + result);
        } else {
            System.out.println("Invalid choice. Please restart the program and choose a valid option.");
        }
        
        scanner.close();
    }
}
