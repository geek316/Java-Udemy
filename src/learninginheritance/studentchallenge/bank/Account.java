package learninginheritance.studentchallenge.bank;

import java.time.LocalDate;

class Account {
    public String accountNumber;
    public String name;
    public String address;
    public String phoneNumber;
    public LocalDate dateOfBirth;
    public String accountType;
    public double balance;

    public Account(String accountNumber, String name, String address, String phoneNumber, LocalDate dateOfBirth) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.accountType = "Open";
    }

    public Account(String accountNumber, String name, LocalDate dateOfBirth) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.accountType = "Open";
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void closeAccount() {
        this.balance = 0;
        this.accountType = "Closed";
        System.out.println("Account closed successfully");
    }

    @Override
    public String toString() {
        return "Account Number: " + this.accountNumber + "\n" + "Name: " + this.name + "\n" + "Address: " + this.address + "\n" + "Phone Number: " + this.phoneNumber + "\n" + "Date of Birth: " + this.dateOfBirth + "\n" + "Balance: " + this.balance + "\n" + "Account Type: " + this.accountType;
    }

}
