/**
 * Name: Edward Golden
 * Date: August 2026
 * Purpose: Represents a family contact.
 * Demonstrates inheritance and interface implementation.
 */
public class FamilyContact extends Contact implements Storable {

    private String relationship;

    public FamilyContact(String firstName, String lastName, String phone,
                         String email, String relationship) {
        super(firstName, lastName, phone, email);
        this.relationship = relationship;
    }

    @Override
    public void display() {
        System.out.println("\n===== FAMILY CONTACT =====");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Relationship: " + relationship);
    }

    @Override
    public void save() { System.out.println("Saving FamilyContact (stub)."); }

    @Override
    public void update() { System.out.println("Updating FamilyContact (stub)."); }

    @Override
    public void delete() { System.out.println("Deleting FamilyContact (stub)."); }

    @Override
    public void load(int id) { System.out.println("Loading FamilyContact id " + id + " (stub)."); }
}
