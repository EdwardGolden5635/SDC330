/**
 * Author: Edward Golden
 * Date: August 2026
 * Purpose: Represents a personal contact.
 */
public class PersonalContact extends Contact {

    public PersonalContact(int id, String firstName,
                           String lastName, String phone,
                           String email) {

        super(id, firstName, lastName, phone, email);
    }

    @Override
    public String getContactType() {
        return "Personal";
    }
}