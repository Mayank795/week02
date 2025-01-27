package encapsulationpolymorphism.bankingsystem;

class CurrentAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.01; // 1% annual interest
    private static final double LOAN_MULTIPLIER = 5; // Loan eligibility = 5 times the balance

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double amount) {
        double eligibility = calculateLoanEligibility();
        if (amount <= eligibility) {
            System.out.printf("Loan of %.2f approved for account %s.\n", amount, getAccountNumber());
        } else {
            System.out.printf("Loan of %.2f denied. Maximum eligibility: %.2f.\n", amount, eligibility);
        }
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * LOAN_MULTIPLIER;
    }
}

