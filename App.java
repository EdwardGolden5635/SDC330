/**
 * Name: Edward Golden
 * Date: August 2026
 * Assignment: Course Project Phase 1
 *
 * Purpose:
 * Demonstrates inheritance and composition
 * using a Rolodex Contact Manager.
 */

public class App {

    public static void main(String[] args) {

        Menu.showWelcome();

        // Composition:
        // A Rolodex HAS-A collection of Contact objects.
        Rolodex rolodex = new Rolodex();

        rolodex.addContact(
            new BusinessContact(
                "John",
                "Smith",
                "555-1111",
                "john@email.com",
                "ABC Corporation"
            )
        );

        rolodex.addContact(
            new FamilyContact(
                "Mary",
                "Smith",
                "555-2222",
                "mary@email.com",
                "Sister"
            )
        );

        rolodex.addContact(
            new FriendContact(
                "Jake",
                "Johnson",
                "555-3333",
                "jake@email.com",
                "JJ"
            )
        );

        rolodex.displayContacts();
    }
}