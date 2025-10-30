Banking System
A simple and beginner-friendly banking application built with Java. This project demonstrates fundamental programming concepts including methods, loops, conditional statements, and user input handling.
Features
✅ Check Balance - View your current account balance
✅ Deposit Money - Add funds to your account with validation
✅ Withdraw Money - Withdraw funds with balance verification
✅ Input Validation - Prevents invalid transactions (negative amounts, insufficient balance)
✅ User-Friendly Menu - Easy-to-use console interface
How to Run
Prerequisites

Java Development Kit (JDK) installed on your system
A terminal or command prompt

Steps

Clone the repository

bash   git clone https://github.com/Jäger/banking-system.git
   cd banking-system

Compile the Java file

bash   javac banking.java

Run the program

bash   java banking
Usage
Once the program runs, you'll see a menu:
BANKING PROGRAM

1. Show Balance
2. Deposit
3. Withdraw
4. Exit

Enter your choice (1-4):
Example Workflow

Check Balance → Select option 1 to see your current balance
Deposit Money → Select option 2 and enter the amount to deposit
Withdraw Money → Select option 3 and enter the amount to withdraw
Exit → Select option 4 to exit the program

Project Structure
banking-system/
├── banking.java    # Main application file
└── README.md       # This file
Code Overview
Main Components

main() - Main program loop that displays the menu and handles user choices
showBalance() - Displays the current account balance
depositcontrol() - Handles deposit transactions with validation
withdrawcontrol() - Handles withdrawal transactions with balance verification

Features Explained
Deposit

Accepts positive amounts only
Prevents negative deposits
Updates balance immediately

Withdraw

Checks if balance is sufficient
Prevents negative or zero withdrawals
Prevents overdrafts

Balance Management

Initial balance starts at $0
Balance is maintained throughout the program session
Final balance is shown when exiting

Error Handling
The application includes validation for:

❌ Negative deposit amounts
❌ Negative withdrawal amounts
❌ Withdrawal amounts exceeding balance
❌ Invalid menu choices

Learning Objectives
This project is designed for beginners to practice:

Java methods and return values
Control flow (loops and conditionals)
User input with Scanner
Data validation
Switch statements

Limitations

Data is not persisted (balance resets when program closes)
Single account only
Console-based interface only

Future Enhancements
Possible improvements for advanced versions:

Save balance to a file
Multiple accounts support
Transaction history
GUI interface
Database integration

Author
Created by Jäger as a beginner Java learning project (Started a week ago. Currently learning OOP.)
License
This project is open source and available for educational purposes.

Happy Coding! 🚀
