/**
 * Name: Edward Golden
 * Date: August 2026
 *
 * FamilyContact inherits from Contact.
 * Demonstrates inheritance.
 */
public class FamilyContact extends Contact {

    private String relationship;

    public FamilyContact(String firstName,
                         String lastName,
                         String phone,
                         String email,
                         String relationship) {

        super(firstName, lastName, phone, email);
        this.relationship = relationship;
    }

    @Override
    public void display() {

        System.out.println("\n===== FAMILY CONTACT =====");

        super.display();

        System.out.println("Relationship: " + relationship);
    }
}