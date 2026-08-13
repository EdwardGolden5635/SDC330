/**
 * Author: Edward Golden
 * Date: August 13, 2026
 * Purpose: Represents a friend contact.
 */

public class FriendContact extends Contact {

    private String nickname;

    public FriendContact() {
        super();
        this.nickname = "Unknown";
    }

    public FriendContact(String name, String phone, String email, String nickname) {
        super(name, phone, email);
        this.nickname = nickname;
    }

    @Override
    public void displayInfo() {
        System.out.println("Friend Contact:");
        System.out.println("Name: " + getName());
        System.out.println("Nickname: " + nickname);
        System.out.println("Phone: " + getPhone());
        System.out.println("Email: " + getEmail());
        System.out.println("-----------------------------------");
    }
}
