/**
 * Author: Edward Golden
 * Date: August 2026
 * Purpose: Represents a friend contact.
 */
public class FriendContact extends Contact {

    public FriendContact(int id, String firstName,
                         String lastName, String phone,
                         String email) {

        super(id, firstName, lastName, phone, email);
    }

    @Override
    public String getContactType() {
        return "Friend";
    }
}