/**
 * Name: Edward Golden
 * Date: August 2026
 *
 * Base Contact class.
 * Demonstrates inheritance.
 */
public class Contact {

    protected String firstName;
    protected String lastName;
    protected String phone;
    protected String email;

    public Contact(String firstName,
                   String lastName,
                   String phone,
                   String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
    }

    public void display() {

        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
    }
}