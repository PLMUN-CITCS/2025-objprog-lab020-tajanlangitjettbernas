import java.util.Scanner;

public class MenuDrivenProgram {

    //Method to display the menu options
    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even or Odd");
        System.out.println("3. Exit");
        System.out.print("Please enter your choice (1-3): ");
    }

    //Method to handle the user's menu choice
    public static void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                greetUser();
                break;
            case 2:
                checkEvenOrOdd();
                break;
            case 3:
                System.out.println("Exiting the program. Goodbye!");
                System.exit(0); // Terminate the program
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
        }
    }

    //method to greet the user
    public static void greetUser() {
        System.out.println("Hello! Welcome to the program.");
    }

    //method to check if a number is even or odd
    public static void checkEvenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        try {
            int number = Integer.parseInt(scanner.nextLine());
            if (number % 2 == 0) {
                System.out.println(number + " is an Even number.");
            } else {
                System.out.println(number + " is an Odd number.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }

    // Main Program Flow
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // Display the menu
            displayMenu();
            // Get the user's choice
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                // Handle the user's choice
                handleMenuChoice(choice);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 3.");
            }
            System.out.println(); // Add a blank line for better readability
        }
    }
}