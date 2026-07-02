package learninginheritance.studentchallenge.communication;

public class CommunicationMain {

    public static void main(String[] args) {

        CellPhone nokia = new CellPhone("123456789", "123456789", "Nokia");
        System.out.println(nokia.toString());
        nokia.makeCall("123456789");
        nokia.sendSMS("123456789");
        nokia.saveContact("John Doe", "123456789");
        nokia.deleteContact("John Doe");

    }

}
