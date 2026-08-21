import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Author: Edward Golden
 * Date: August 2026
 * Purpose: Manages contacts stored in a SQLite database.
 * Demonstrates composition by managing Contact objects.
 */
public class Rolodex {

    private Connection connection;

    /**
     * Constructor
     */
    public Rolodex() {

        try {

            connection =
                DriverManager.getConnection(
                    "jdbc:sqlite:rolodex.db"
                );

            createTable();

        } catch (Exception e) {

            System.out.println(
                "Database connection error: "
                + e.getMessage()
            );
        }
    }

    /**
     * Creates the contacts table if it does not exist.
     */
    private void createTable() {

        String sql =
            "CREATE TABLE IF NOT EXISTS contacts (" +
            "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "firstName TEXT NOT NULL, " +
            "lastName TEXT NOT NULL, " +
            "phone TEXT NOT NULL, " +
            "email TEXT, " +
            "contactType TEXT NOT NULL" +
            ")";

        try {

            Statement stmt =
                connection.createStatement();

            stmt.execute(sql);

        } catch (Exception e) {

            System.out.println(
                "Table creation error: "
                + e.getMessage()
            );
        }
    }

    /**
     * Add a contact.
     */
    public void addContact(Contact contact) {

        String sql =
            "INSERT INTO contacts " +
            "(firstName, lastName, phone, email, contactType) " +
            "VALUES (?, ?, ?, ?, ?)";

        try {

            PreparedStatement stmt =
                connection.prepareStatement(sql);

            stmt.setString(
                1,
                contact.getFirstName()
            );

            stmt.setString(
                2,
                contact.getLastName()
            );

            stmt.setString(
                3,
                contact.getPhone()
            );

            stmt.setString(
                4,
                contact.getEmail()
            );

            stmt.setString(
                5,
                contact.getContactType()
            );

            stmt.executeUpdate();

            System.out.println(
                "Contact added successfully."
            );

        } catch (Exception e) {

            System.out.println(
                "Add error: "
                + e.getMessage()
            );
        }
    }

    /**
     * Display all contacts.
     */
    public void displayContacts() {

        String sql = "SELECT * FROM contacts";

        try {

            Statement stmt =
                connection.createStatement();

            ResultSet rs =
                stmt.executeQuery(sql);

            System.out.println();
            System.out.println(
                "===== ALL CONTACTS ====="
            );

            while (rs.next()) {

                System.out.println(
                    rs.getInt("id")
                    + " | "
                    + rs.getString("firstName")
                    + " "
                    + rs.getString("lastName")
                    + " | "
                    + rs.getString("phone")
                    + " | "
                    + rs.getString("email")
                    + " | "
                    + rs.getString("contactType")
                );
            }

        } catch (Exception e) {

            System.out.println(
                "Display error: "
                + e.getMessage()
            );
        }
    }

    /**
     * Display contacts whose last name begins
     * with a specified letter.
     */
    public void displayByLetter(String letter) {

        String sql =
            "SELECT * FROM contacts " +
            "WHERE lastName LIKE ?";

        try {

            PreparedStatement stmt =
                connection.prepareStatement(sql);

            stmt.setString(
                1,
                letter + "%"
            );

            ResultSet rs =
                stmt.executeQuery();

            System.out.println();
            System.out.println(
                "===== MATCHING CONTACTS ====="
            );

            while (rs.next()) {

                System.out.println(
                    rs.getInt("id")
                    + " | "
                    + rs.getString("firstName")
                    + " "
                    + rs.getString("lastName")
                    + " | "
                    + rs.getString("phone")
                );
            }

        } catch (Exception e) {

            System.out.println(
                "Search error: "
                + e.getMessage()
            );
        }
    }

    /**
     * Update a contact phone number.
     */
    public void updateContact(
            int id,
            String phone) {

        String sql =
            "UPDATE contacts " +
            "SET phone = ? " +
            "WHERE id = ?";

        try {

            PreparedStatement stmt =
                connection.prepareStatement(sql);

            stmt.setString(
                1,
                phone
            );

            stmt.setInt(
                2,
                id
            );

            int rows =
                stmt.executeUpdate();

            if (rows > 0) {

                System.out.println(
                    "Contact updated."
                );

            } else {

                System.out.println(
                    "Contact not found."
                );
            }

        } catch (Exception e) {

            System.out.println(
                "Update error: "
                + e.getMessage()
            );
        }
    }

    /**
     * Remove a contact.
     */
    public void removeContact(int id) {

        String sql =
            "DELETE FROM contacts " +
            "WHERE id = ?";

        try {

            PreparedStatement stmt =
                connection.prepareStatement(sql);

            stmt.setInt(
                1,
                id
            );

            int rows =
                stmt.executeUpdate();

            if (rows > 0) {

                System.out.println(
                    "Contact removed."
                );

            } else {

                System.out.println(
                    "Contact not found."
                );
            }

        } catch (Exception e) {

            System.out.println(
                "Delete error: "
                + e.getMessage()
            );
        }
    }

    /**
     * Close database connection.
     */
    public void close() {

        try {

            if (connection != null) {

                connection.close();
            }

        } catch (Exception e) {

            System.out.println(
                "Close error: "
                + e.getMessage()
            );
        }
    }
}