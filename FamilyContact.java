/**
 * Author: Edward Golden
 * Date: August 2026
 * Purpose: Represents a family contact.
 */
public class FamilyContact extends Contact {

    public FamilyContact(int id, String firstName,
                         String lastName, String phone,
                         String email) {

        super(id, firstName, lastName, phone, email);
    }

    @Override
    public String getContactType() {
        return "Family";
    }
}