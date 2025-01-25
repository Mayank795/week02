package heirarchicalinheritance.bankaccounttypes;

class FixedDepositAccount extends BankAccount {
    private double maturityAmount;
    private int maturityPeriod; // In months


    // Constructor
    public FixedDepositAccount(String accountNumber, double balance, double maturityAmount, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityAmount = maturityAmount;
        this.maturityPeriod = maturityPeriod;
    }


    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }


    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Maturity Amount: $" + maturityAmount);
        System.out.println("Maturity Period: " + maturityPeriod + " months");
    }
}

