package learninginheritance.studentchallenge.bank;

import java.time.LocalDate;

public class StudentChallengeAccountCustomer {
    public static void main(String[] args) {

        SavingsAccount account = new SavingsAccount("123456789", "John Doe", "123 Main St", "555-1234", LocalDate.of(1990, 1, 1));
        account.deposit(1000);
        account.withdraw(500);
        account.fixedDeposit(1000);
        account.liquidateFixedDeposit();
        System.out.println(account.toString());

    }
}

