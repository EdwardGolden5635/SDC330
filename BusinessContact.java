/**
 * Name: Edward Golden
 * Date: August 2026
 * Purpose: Represents a business contact.
 * Demonstrates inheritance and interface implementation.
 */
public class BusinessContact extends Contact implements Storable {

    private String company;

    public BusinessContact(String firstName, String lastName, String phone,
                           String email, String company) {
        super(firstName, lastName, phone, email);
        this.company = company;
    }

    @Override
    public void display() {
        System.out.println("\n===== BUSINESS CONTACT =====");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Company: " + company);
    }

    // Interface polymorphism
    @Override
    public void save() { System.out.println("Saving BusinessContact (stub)."); }

    @Override
    public void update() { System.out.println("Updating BusinessContact (stub)."); }

    @Override
    public void delete() { System.out.println("Deleting BusinessContact (stub)."); }

    @Override
    public void load(int id) { System.out.println("Loading BusinessContact id " + id + " (stub)."); }
}
