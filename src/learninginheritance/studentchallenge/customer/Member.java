package learninginheritance.studentchallenge.customer;

import java.time.LocalDate;

public class Member extends Customer {

    private String customerID;
    private String address;
    private LocalDate dateOfBirth;

    public Member(String name, String phoneNumber, String customerID, String address, LocalDate dateOfBirth) {
        super(name, phoneNumber);
        this.customerID = customerID;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        System.out.println("Member constructor called");
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void callback() {
        System.out.println(getName() + " is being called back");
    }

}
