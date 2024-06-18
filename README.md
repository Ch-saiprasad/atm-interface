# simple ATM interface in java

This repository contains a simple Java program that simulates an ATM (Automated Teller Machine) with basic functionalities such as
- withdrawing money
- depositing money
- checking balance
- exiting the program.

## How to Use

1. *Clone the Repository*

   Clone this repository to your local machine using the following command:
   ```
   git clone https://github.com/your-username/atm-java.git
   ```

2. *Compile the Program*

   Navigate to the project directory and compile the Java file:
   ```
   javac ATM.java
   ```

3. *Run the Program*

   Execute the compiled Java program to start the ATM simulation:
   ```
   java ATM
   ```

4. *Follow the Prompts*

   Follow the instructions displayed on the console to perform transactions:
   - Enter `1` to withdraw money.
   - Enter `2` to deposit money.
   - Enter `3` to check your balance.
   - Enter `4` to exit the ATM program.

### Example Usage

```
Welcome to the ATM
1. Withdraw
2. Deposit
3. Check Balance
4. Exit
Enter your choice: 2
Enter amount to deposit: 100
Deposit successful.
Current Balance: 100.0

Welcome to the ATM
1. Withdraw
2. Deposit
3. Check Balance
4. Exit
Enter your choice: 1
Enter amount to withdraw: 50
Withdrawal successful.
Current Balance: 50.0

Welcome to the ATM
1. Withdraw
2. Deposit
3. Check Balance
4. Exit
Enter your choice: 3
Current Balance: 50.0

Welcome to the ATM
1. Withdraw
2. Deposit
3. Check Balance
4. Exit
Enter your choice: 4
Thank you for using the ATM!
```
### Features

- **Withdraw**: Allows the user to withdraw money from their account. It checks if the withdrawal amount is valid and updates the balance accordingly.
- **Deposit**: Allows the user to deposit money into their account. It checks if the deposit amount is valid and updates the balance accordingly.
- **Check Balance**: Displays the current balance to the user.
- **Exit**: Allows the user to exit the ATM program.

### Notes

- This is the basic implementation for educational purposes and may not cover all real world scenarios (e.g., authentication , database integration)
- The transaction history and account balance are stored in memory and reset each time the program is run.  
