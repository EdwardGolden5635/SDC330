/**
 * Name: Edward Golden
 * Date: August 2026
 * Purpose: Abstract base class for all contacts.
 * Demonstrates inheritance and polymorphism.
 */
public abstract class Contact {

    protected String firstName;
    protected String lastName;
    protected String phone;
    protected String email;

    public Contact(String firstName, String lastName, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
    }

    // Polymorphic method
    public abstract void display();
}
