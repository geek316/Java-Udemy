package learninginheritance.studentchallenge.bank;

import java.time.LocalDate;

public class LoanAccount extends Account {

    public LoanAccount(String accountNumber, String name, String address, String phoneNumber, LocalDate dateOfBirth) {
        super(accountNumber, name, address, phoneNumber, dateOfBirth);
    }

    public LoanAccount(String accountNumber, String name, LocalDate dateOfBirth) {
        super(accountNumber, name, dateOfBirth);
    }

    public double payEMI(double amount) {
        return this.balance -= amount;

    }

    public double topUpLoan(double amount) {
        return this.balance += amount;
    }

    public double repayment(double amount) {
        return this.balance += amount;
    }

}
