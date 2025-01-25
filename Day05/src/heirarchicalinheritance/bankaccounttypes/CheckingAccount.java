package heirarchicalinheritance.bankaccounttypes;

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;


    // Constructor
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }


    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }


    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}

