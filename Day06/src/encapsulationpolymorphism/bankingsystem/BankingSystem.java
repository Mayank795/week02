package encapsulationpolymorphism.bankingsystem;

import java.util.ArrayList;
import java.util.List;

public class BankingSystem {

    public static void processAccounts(List<BankAccount> accounts) {
        for (BankAccount account : accounts) {
            System.out.printf("Account: %s, Holder: %s, Balance: %.2f, Interest: %.2f\n",
                    account.getAccountNumber(), account.getHolderName(),
                    account.getBalance(), account.calculateInterest());

            if (account instanceof Loanable) {
                Loanable loanable = (Loanable) account;
                System.out.printf("Loan Eligibility: %.2f\n", loanable.calculateLoanEligibility());
            }
        }
    }

    public static void main(String[] args) {
        List<BankAccount> accountList = new ArrayList<>();

        accountList.add(new SavingsAccount("S123", "Alice", 1000));
        accountList.add(new CurrentAccount("C456", "Bob", 2000));

        processAccounts(accountList);

        // Demonstrating deposit, withdrawal, and loan application
        BankAccount aliceAccount = accountList.get(0);
        aliceAccount.deposit(500);
        aliceAccount.withdraw(300);

        CurrentAccount bobAccount = (CurrentAccount) accountList.get(1);
        bobAccount.applyForLoan(8000);
        bobAccount.applyForLoan(12000);
    }
}

