import java.util.Scanner;

public class ATM {

    private double balance; // Variable to store balance
    private Scanner scanner; // Scanner object for user input

    // Constructor to initialize balance and scanner
    public ATM() {
        balance = 0.0; // Starting balance is zero
        scanner = new Scanner(System.in);
    }

    // Method to display menu and handle user input
    public void run() {
        int choice;

        do {
            // Display menu options
            System.out.println("Welcome to the ATM");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            // Read user choice
            choice = scanner.nextInt();

            // Perform actions based on user choice
            switch (choice) {
                case 1:
                    withdraw();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (choice != 4);
    }

    // Method to handle withdrawal
    private void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        }
        System.out.println("Current Balance: " + balance);
    }

    // Method to handle deposit
    private void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else {
            balance += amount;
            System.out.println("Deposit successful.");
        }
        System.out.println("Current Balance: " + balance);
    }

    // Method to check balance
    private void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Main method to start the ATM program
    public static void main(String[] args) {
        ATM atm = new ATM(); // Create an instance of ATM
        atm.run(); // Start the ATM program
    }
}
