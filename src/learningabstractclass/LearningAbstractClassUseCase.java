package learningabstractclass;

public class LearningAbstractClassUseCase {
    public static void main(String[] args) {

        Hospital publicHospital = new PublicHospital();
        publicHospital.emergency();
        publicHospital.appointment();
        publicHospital.admit();
        publicHospital.billing();
    }
}

abstract class Hospital {

    abstract void emergency();

    abstract void appointment();

    abstract void admit();

    abstract void billing();

}

class PublicHospital extends Hospital {

    @Override
    void emergency() {
        System.out.println("Call 911, officer we got a situation here.");
    }

    @Override
    void appointment() {
        System.out.println("Agar marij marne ke halat mein hai toh fir bhi apun ko appointment lene ka hai kya?");
    }

    @Override
    void admit() {
        System.out.println("Paisa do, free mein admit nahi karega!");
    }

    @Override
    void billing() {
        System.out.println("Billing Clinton");
    }
}


