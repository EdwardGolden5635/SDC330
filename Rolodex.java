import java.util.ArrayList;

/**
 * Name: Edward Golden
 * Date: August 2026
 * Purpose: Stores and displays contacts.
 * Demonstrates composition and polymorphism.
 */
public class Rolodex {

    private ArrayList<Contact> contacts;

    public Rolodex() {
        contacts = new ArrayList<Contact>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void displayContacts() {
        System.out.println("\n==============================");
        System.out.println("      CONTACT DIRECTORY");
        System.out.println("==============================");

        for (Contact contact : contacts) {
            contact.display(); // Polymorphism
            System.out.println("------------------------------");
        }
    }
}
