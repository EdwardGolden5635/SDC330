/**
 * Author: Edward Golden
 * Date: August 13, 2026
 * Purpose: Abstract base class for all contact types in the Rolodex application.
 * Demonstrates abstraction, constructors, and proper use of access specifiers.
 */

public abstract class Contact {

    // Private fields ensure encapsulation
    private String name;
    private String phone;
    private String email;

    // Default constructor
    public Contact() {
        this.name = "Unknown";
        this.phone = "N/A";
        this.email = "N/A";
    }

    // Parameterized constructor
    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    // Protected getters allow subclasses to access data safely
    protected String getName() { return name; }
    protected String getPhone() { return phone; }
    protected String getEmail() { return email; }

    // Abstract method forces subclasses to define display behavior
    public abstract void displayInfo();
}
