package learninginterface;

interface Member {

    void callBack();

}

class Store {

    Member[] member = new Member[100];
    int count = 0;

    void register(Member m) {
        member[count++] = m;
    }

    void inviteSale() {
        for (int i = 0; i < count; i++) {
            member[i].callBack();
        }
    }

}

class Customer implements Member {

    String name;

    Customer(String name) {
        this.name = name;
    }

    @Override
    public void callBack() {
        System.out.println(name + " is invited to sale");
    }
}

public class StudentChallengeCallbackMethod {
    public static void main(String[] args) {

        Store store = new Store();
        Customer c1 = new Customer("John");
        Customer c2 = new Customer("Jane");

        store.register(c1);
        store.register(c2);

        store.inviteSale();

    }
}