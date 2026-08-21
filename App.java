import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Rolodex rolodex = new Rolodex();

        int choice;

        do {

            Menu.displayMenu();

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1:

                    System.out.print("First Name: ");
                    String first = scanner.nextLine();

                    System.out.print("Last Name: ");
                    String last = scanner.nextLine();

                    System.out.print("Phone: ");
                    String phone = scanner.nextLine();

                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    System.out.print(
                        "Type (Business, Family, Friend, Personal): ");

                    String type = scanner.nextLine();

                    Contact contact;

                    if (type.equalsIgnoreCase("Business")) {

                        contact = new BusinessContact(
                            0, first, last, phone, email);

                    } else if (type.equalsIgnoreCase("Family")) {

                        contact = new FamilyContact(
                            0, first, last, phone, email);

                    } else if (type.equalsIgnoreCase("Friend")) {

                        contact = new FriendContact(
                            0, first, last, phone, email);

                    } else {

                        contact = new PersonalContact(
                            0, first, last, phone, email);
                    }

                    rolodex.addContact(contact);
                    break;

                case 2:
                    rolodex.displayContacts();
                    break;

                case 3:

                    System.out.print("ID: ");
                    int id = Integer.parseInt(scanner.nextLine());

                    System.out.print("New Phone: ");
                    String newPhone = scanner.nextLine();

                    rolodex.updateContact(id, newPhone);
                    break;

                case 4:

                    System.out.print("ID: ");
                    int deleteId = Integer.parseInt(scanner.nextLine());

                    rolodex.removeContact(deleteId);
                    break;

                case 5:

                    System.out.print(
                        "Last name starts with: ");

                    String letter = scanner.nextLine();

                    rolodex.displayByLetter(letter);
                    break;

                case 6:

                    System.out.println("Goodbye!");
                    break;

                default:

                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        rolodex.close();
        scanner.close();
    }
}