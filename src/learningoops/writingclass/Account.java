package learningoops.writingclass;

public class Account {

    private long accountNumber;
    private String name;
    private String accountType;
    private double balance;

    public double deposit(double amount) {
        return balance += amount;
    }

    public double withdraw(double amount) {
        return balance -= amount;
    }
}
