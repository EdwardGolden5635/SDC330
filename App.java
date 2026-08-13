/**
 * Author: Edward Golden
 * Date: August 13, 2026
 * Purpose: Week 3 Rolodex application demonstrating abstraction, constructors,
 * access specifiers, and polymorphism.
 */

public class App {

    public static void main(String[] args) {

        System.out.println("-----------------------------------------");
        System.out.println("Project Week 3");
        System.out.println("Created by: Edward Golden");
        System.out.println("-----------------------------------------\n");

        System.out.println("Welcome to the Rolodex Application!");

        // Instantiate classes with realistic information
        Contact business = new BusinessContact(
                "Sarah Johnson", "757-555-1234", "sarah@techcorp.com",
                "TechCorp", "Project Manager"
        );

        Contact personal = new PersonalContact(
                "Michael Brown", "757-555-9876", "michael@gmail.com",
                "04/12/1990"
        );

        Contact friend = new FriendContact(
                "Jason Lee", "757-555-2222", "jason@yahoo.com",
                "Jay"
        );

        Contact family = new FamilyContact(
                "Linda Golden", "757-555-3333", "linda@gmail.com",
                "Mother"
        );

        // Polymorphic display
        business.displayInfo();
        personal.displayInfo();
        friend.displayInfo();
        family.displayInfo();
    }
}
