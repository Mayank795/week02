class BankAccount {
    // Attributes
    private String accountHolder;
    private int accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited $%.2f. New balance: $%.2f%n", amount, balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            balance -= amount;
            System.out.printf("Withdrew $%.2f. Remaining balance: $%.2f%n", amount, balance);
        }
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.printf("Current balance: $%.2f%n", balance);
    }

    // Main method to test the program
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account = new BankAccount("John Doe", 123456, 500.00);

        // Perform some transactions
        account.displayBalance();
        account.deposit(200.00);
        account.withdraw(100.00);
        account.withdraw(700.00);
        account.displayBalance();
    }
}
