/**
 * Author: Edward Golden
 * Date: August 2026
 * Purpose: Represents a business contact.
 */
public class BusinessContact extends Contact {

    public BusinessContact(int id, String firstName,
                           String lastName, String phone,
                           String email) {

        super(id, firstName, lastName, phone, email);
    }

    @Override
    public String getContactType() {
        return "Business";
    }
}