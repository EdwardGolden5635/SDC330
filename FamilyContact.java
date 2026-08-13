/**
 * Author: Edward Golden
 * Date: August 13, 2026
 * Purpose: Represents a family contact.
 */

public class FamilyContact extends Contact {

    private String relation;

    public FamilyContact() {
        super();
        this.relation = "Unknown";
    }

    public FamilyContact(String name, String phone, String email, String relation) {
        super(name, phone, email);
        this.relation = relation;
    }

    @Override
    public void displayInfo() {
        System.out.println("Family Contact:");
        System.out.println("Name: " + getName());
        System.out.println("Relation: " + relation);
        System.out.println("Phone: " + getPhone());
        System.out.println("Email: " + getEmail());
        System.out.println("-----------------------------------");
    }
}
