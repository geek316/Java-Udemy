package learningcollectionframework.practice.arraylist;

import java.util.ArrayList;
import java.util.Comparator;

public class Level5HardProblem5 {
    static void main() {

//        27. Mini Contact Manager
//        Create:
//        class Contact {
//            String name;
//            String phone;
//        }
//        Store in: ArrayList<Contact>
//        Features:
//        Add contact
//        Delete contact
//        Search contact
//        Update phone number
//        Display all contacts alphabetically

        ArrayList<Contact> contacts = new ArrayList<>();

        ContactManager directory = new ContactManager(contacts);
        directory.addContact("Summi", "1234");
        directory.addContact("Hemant", "7890");
        directory.addContact("Mukesh", "4567");
        directory.addContact("Anshal", "3456");

        directory.deleteContact("Anshal");
        System.out.println("\nSearching contact:.. " + directory.searchContact("Summi"));
        directory.updateContact("Summi", "9999");
        directory.displayAlphabetically();
    }
}

class ContactManager{

    ArrayList<Contact> contacts;

    public ContactManager(ArrayList<Contact> contacts){
        this.contacts = contacts;
    }

    public void addContact(String name, String phone){
        contacts.add(new Contact(name, phone));
        System.out.println("\nAdded Contact: " + name);
        for(Contact val: contacts){
            System.out.println(val);
        }
    }

    public void deleteContact(String name){
        contacts.removeIf(contact -> contact.name.equals(name));
        System.out.println("\nDeleted Contact: " + name);
        for(Contact val: contacts){
            System.out.println(val);
        }
    }

    public Contact searchContact(String name){
        Contact presentContact = null;
        for(Contact contact: contacts){
            if(contact.name.equals(name)) presentContact = contact;
        }
        return presentContact;
    }

    public void updateContact(String name, String phone){
        for(Contact contact: contacts){
            if(contact.name.equals(name)){
                contact.phone = phone;
            }
        }
        System.out.println("\nUpdated Phone Number for: " + name);
        for(Contact val: contacts){
            System.out.println(val);
        }
    }

    public void displayAlphabetically(){
        for(int i=0; i<contacts.size(); i++){
            contacts.sort(Comparator.comparing(student -> student.name));
        }
        System.out.println("\nSorted Alphabetically: ");
        for(Contact val: contacts){
            System.out.println(val);
        }
    }
}


class Contact {
    String name;
    String phone;

    public Contact(String name, String phone){
        this.name = name;
        this.phone = phone;
    }

    public String toString(){
        return "Name: "+name+", Phone Number: "+ phone;
    }
}
