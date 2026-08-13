/**
 * Author: Edward Golden
 * Date: August 13, 2026
 * Purpose: Represents a business contact. Demonstrates inheritance and abstraction.
 */

public class BusinessContact extends Contact {

    private String company;
    private String jobTitle;

    public BusinessContact() {
        super();
        this.company = "Unknown Company";
        this.jobTitle = "Unknown Title";
    }

    public BusinessContact(String name, String phone, String email,
                           String company, String jobTitle) {
        super(name, phone, email);
        this.company = company;
        this.jobTitle = jobTitle;
    }

    @Override
    public void displayInfo() {
        System.out.println("Business Contact:");
        System.out.println("Name: " + getName());
        System.out.println("Phone: " + getPhone());
        System.out.println("Email: " + getEmail());
        System.out.println("Company: " + company);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("-----------------------------------");
    }
}
