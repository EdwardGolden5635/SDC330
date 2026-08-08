/**
 * Name: Edward Golden
 * Date: August 2026
 * Purpose: Represents a friend contact.
 * Demonstrates inheritance and interface implementation.
 */
public class FriendContact extends Contact implements Storable {

    private String nickname;

    public FriendContact(String firstName, String lastName, String phone,
                         String email, String nickname) {
        super(firstName, lastName, phone, email);
        this.nickname = nickname;
    }

    @Override
    public void display() {
        System.out.println("\n===== FRIEND CONTACT =====");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Nickname: " + nickname);
    }

    @Override
    public void save() { System.out.println("Saving FriendContact (stub)."); }

    @Override
    public void update() { System.out.println("Updating FriendContact (stub)."); }

    @Override
    public void delete() { System.out.println("Deleting FriendContact (stub)."); }

    @Override
    public void load(int id) { System.out.println("Loading FriendContact id " + id + " (stub)."); }
}
