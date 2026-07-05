package learningmultithreading;

public class StudentChallengeATMMachine {
    static void main() {

        ATM sbi = new ATM();


        Thread summi = new Thread(new Customer("Summi", sbi, 4321), "Summi-Thread");
        Thread hemant = new Thread(new Customer("Hemant", sbi, 6542), "Hemant-Thread");
        Thread mukesh = new Thread(new Customer("Mukesh", sbi, 5432), "Mukesh-Thread");
        Thread anshal = new Thread(new Customer("Anshal", sbi, 76543), "Anshal-Thread");
        Thread sachin = new Thread(new Customer("Sachin", sbi, 523), "Sachin-Thread");
        Thread dhoni = new Thread(new Customer("Dhoni", sbi, 1344), "Dhoni-Thread");
        Thread virat = new Thread(new Customer("Virat", sbi, 6431), "Virat-Thread");

        summi.start();
        hemant.start();
        mukesh.start();
        anshal.start();
        sachin.start();
        dhoni.start();
        virat.start();

    }
}


class ATM {

    private float balance = 100000.00f;

    void withdraw(String customerName, float amount) {
        if (balance < amount) {
            System.out.println(Thread.currentThread().getName() + " : " + customerName + " has insufficient balance cannot withdraw amount");
        } else {
            balance -= amount;
            System.out.print(Thread.currentThread().getName() + " : " + customerName + " has withdrawn... ");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(amount);
        }
    }

    void getBalance(String customerName) {
        System.out.print(Thread.currentThread().getName() + " : " + customerName + " has a balance of... ");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(balance);
    }

}

class Customer extends Thread {
    private final String customerName;
    private final ATM atm;
    private final int amount;

    public Customer(String customerName, ATM atm, int amount) {
        this.customerName = customerName;
        this.atm = atm;
        this.amount = amount;
    }

    public void run() {
        useATM();
    }

    void useATM() {
        synchronized (atm) {
            atm.getBalance(customerName);
            atm.withdraw(customerName, amount);
        }
    }
}

