import java.util.Scanner;

public class banking {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            
            System.out.println("\nBANKING PROGRAM");
            
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
           

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance); 
                case 2 -> balance +=depositcontrol(balance);
                case 3 -> balance -= withdrawcontrol(balance);
                case 4 -> {
    System.out.println("\n========== EXIT ==========");
    System.out.println("See you next time!");
    System.out.println("Final Balance: $" + balance);
    System.out.println("==========================\n");
    isRunning = false;
}
                default -> System.out.println("Invalid Choice");
            }
        }

        scanner.close();
    }

    
    static void showBalance(double balance) {
        System.out.println("Current Balance: $"+ balance);
    }
    static double depositcontrol(double balance){
        double amount;
        System.out.println("Current balance: $" + balance);
        System.out.print("Enter an amount to be deposited.");
        amount= scanner.nextDouble();
        if(amount<0){
            System.out.println("Amount can't be negative. ");
            return 0;
        }
        else{
            System.out.println("Deposit succesfull!");
            System.out.println("New balance: $" + (balance + amount));
            return amount;
        }    
    }
    static double withdrawcontrol(double balance){
        double withdrawamount;
        System.out.println("Current balance: $" + balance);
        System.out.print("Enter an amount to withdraw. ");
        withdrawamount=scanner.nextDouble();
        if(withdrawamount<=0){
            System.out.println("Withdraw amount must be greater than $0. ");
            return 0;
        }
        else if(withdrawamount>balance){
            System.out.println("Withdraw amount must be greater than $" + balance);
            return 0;
        }
        else{
            System.out.println("Withdraw succesfull!");
            System.out.println("New balance: $" + (balance-withdrawamount));
            return withdrawamount;
        }
    }
}
