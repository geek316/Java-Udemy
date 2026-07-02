package learninginheritance.studentchallenge.communication;

public class CellPhone {

    private final String phoneNumber;
    private final String imeiNumber;
    private final String brand;

    public CellPhone(String phoneNumber, String imeiNumber, String brand) {
        this.phoneNumber = phoneNumber;
        this.imeiNumber = imeiNumber;
        this.brand = brand;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getImeiNumber() {
        return imeiNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void makeCall(String phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    public void sendSMS(String phoneNumber) {
        System.out.println("Sending SMS to " + phoneNumber);
    }

    public void saveContact(String name, String phoneNumber) {
        System.out.println("Saving contact " + name + " with phone number " + phoneNumber);
    }

    public void deleteContact(String name) {
        System.out.println("Deleting contact " + name);
    }

    public String toString() {
        return "Phone Number: " + phoneNumber + "\nIMEI Number: " + imeiNumber + "\nBrand: " + brand;
    }
}
