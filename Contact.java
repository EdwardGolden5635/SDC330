public abstract class Contact {

    protected int id;
    protected String firstName;
    protected String lastName;
    protected String phone;
    protected String email;

    public Contact(int id, String firstName, String lastName,
                   String phone, String email) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
    }

    public abstract String getContactType();

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void display() {

        System.out.println(
            id + " | " +
            firstName + " " +
            lastName + " | " +
            phone + " | " +
            email + " | " +
            getContactType()
        );
    }
}