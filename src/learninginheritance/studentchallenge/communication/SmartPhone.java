package learninginheritance.studentchallenge.communication;

public class SmartPhone extends CellPhone {

    private final String macNumber;

    public SmartPhone(String phoneNumber, String imeiNumber, String brand, String macNumber) {
        super(phoneNumber, imeiNumber, brand);
        this.macNumber = macNumber;
    }

    public String getMacNumber() {
        return macNumber;
    }

    public void play() {
        System.out.println("Playing songs..");
    }

    public void click() {
        System.out.println("Clicking pictures..");
    }

    public void record() {
        System.out.println("Recording videos..");
    }

    public String toString() {
        return "Phone Number: " + getPhoneNumber() + "\nIMEI Number: " + getImeiNumber() + "\nBrand: " + getBrand() + "\nMAC Number: " + getMacNumber();
    }
}
