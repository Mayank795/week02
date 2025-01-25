package heirarchicalinheritance.bankaccounttypes;

class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }

    // Method to calculate interest
    public double calculateInterest() {
        return balance * interestRate / 100;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

