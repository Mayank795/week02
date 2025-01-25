package heirarchicalinheritance.bankaccounttypes;

class BankAccount {
    protected String accountNumber;
    protected double balance;


    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    // Method to display account details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }


    // Method to display account type (to be overridden by subclasses)
    public void displayAccountType() {
        System.out.println("This is a generic bank account.");
    }
}

