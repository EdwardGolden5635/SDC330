/**
 * Author: Edward Golden
 * Date: August 13, 2026
 * Purpose: Represents a personal contact. Demonstrates constructor chaining.
 */

public class PersonalContact extends Contact {

    private String birthday;

    public PersonalContact() {
        super();
        this.birthday = "Unknown";
    }

    public PersonalContact(String name, String phone, String email, String birthday) {
        super(name, phone, email);
        this.birthday = birthday;
    }

    @Override
    public void displayInfo() {
        System.out.println("Personal Contact:");
        System.out.println("Name: " + getName());
        System.out.println("Phone: " + getPhone());
        System.out.println("Email: " + getEmail());
        System.out.println("Birthday: " + birthday);
        System.out.println("-----------------------------------");
    }
}
