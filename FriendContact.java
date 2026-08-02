/**
 * Name: Edward Golden
 * Date: August 2026
 *
 * FriendContact inherits from Contact.
 * Demonstrates inheritance.
 */
public class FriendContact extends Contact {

    private String nickname;

    public FriendContact(String firstName,
                         String lastName,
                         String phone,
                         String email,
                         String nickname) {

        super(firstName, lastName, phone, email);
        this.nickname = nickname;
    }

    @Override
    public void display() {

        System.out.println("\n===== FRIEND CONTACT =====");

        super.display();

        System.out.println("Nickname: " + nickname);
    }
}
