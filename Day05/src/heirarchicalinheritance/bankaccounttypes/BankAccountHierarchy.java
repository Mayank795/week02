package heirarchicalinheritance.bankaccounttypes;

public class BankAccountHierarchy {
    public static void main(String[] args) {
        // Create a SavingsAccount instance
        SavingsAccount savings = new SavingsAccount("SA12345", 1000.0, 3.5);
        savings.displayAccountType();
        savings.displayDetails();
        System.out.println("Interest Earned: $" + savings.calculateInterest());

        System.out.println();

        // Create a CheckingAccount instance
        CheckingAccount checking = new CheckingAccount("CA67890", 2000.0, 500.0);
        checking.displayAccountType();
        checking.displayDetails();

        System.out.println();

        // Create a FixedDepositAccount instance
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD11223", 5000.0, 6000.0, 12);
        fixedDeposit.displayAccountType();
        fixedDeposit.displayDetails();
    }
}

