package learninginheritance.studentchallenge.customer;

public class Customer {

    private String name;
    private String phoneNumber;

    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        System.out.println("Customer constructor called");
    }

    public void payBill() {
        System.out.println(name + " is paying bill..");
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
