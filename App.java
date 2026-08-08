/**
 * Name: Edward Golden
 * Date: August 2026
 * Purpose: Main driver demonstrating Week 2 OOP concepts.
 */
public class App {

    public static void main(String[] args) {

        Menu.showWelcome();

        Rolodex rolodex = new Rolodex();

        BusinessContact bc = new BusinessContact(
                "John", "Smith", "555-1111", "john@email.com", "ABC Corporation");

        FamilyContact fc = new FamilyContact(
                "Mary", "Smith", "555-2222", "mary@email.com", "Sister");

        FriendContact fr = new FriendContact(
                "Jake", "Johnson", "555-3333", "jake@email.com", "JJ");

        rolodex.addContact(bc);
        rolodex.addContact(fc);
        rolodex.addContact(fr);

        rolodex.displayContacts(); // Polymorphism

        Storable s1 = bc;
        Storable s2 = fc;
        Storable s3 = fr;

        s1.save();
        s2.save();
        s3.save();
    }
}
