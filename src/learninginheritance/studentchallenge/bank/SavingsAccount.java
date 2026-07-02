package learninginheritance.studentchallenge.bank;

import java.time.LocalDate;

public class SavingsAccount extends Account {

    public SavingsAccount(String accountNumber, String name, String address, String phoneNumber, LocalDate dateOfBirth) {
        super(accountNumber, name, address, phoneNumber, dateOfBirth);
    }

    public SavingsAccount(String accountNumber, String name, LocalDate dateOfBirth) {
        super(accountNumber, name, dateOfBirth);
    }

    public double deposit(double amount) {
        return this.balance += amount;
    }

    public double withdraw(double amount) {
        return this.balance -= amount;
    }

    public double fixedDeposit(double amount) {
        return this.balance += amount;
    }

    public double liquidateFixedDeposit() {
        return this.balance;
    }


}
