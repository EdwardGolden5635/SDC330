import java.util.ArrayList;

/**
 * Name: Edward Golden
 * Date: August 2026
 *
 * Demonstrates composition.
 * A Rolodex HAS-A collection of Contact objects.
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

            contact.display();

            System.out.println("------------------------------");
        }
    }
}