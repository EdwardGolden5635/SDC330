/**
 * Name: Edward Golden
 * Date: August 2026
 *
 * BusinessContact inherits from Contact.
 * Demonstrates inheritance.
 */

public class BusinessContact extends Contact {

    private String company;

    public BusinessContact(String firstName,
                           String lastName,
                           String phone,
                           String email,
                           String company) {

        super(firstName, lastName, phone, email);
        this.company = company;
    }

    @Override
    public void display() {

        System.out.println("\n===== BUSINESS CONTACT =====");

        super.display();

        System.out.println("Company: " + company);
    }
}