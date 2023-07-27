package patterns.structural.adapter;

public class EmployeeView {
    private String en;
    private String firstName;
    private String lastName;
    private String email;

    public EmployeeView(String en, String firstName, String lastName, String email) {
        this.en = en;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getEn() {
        return en;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "EmployeeView{" +
                "en='" + en + '\'' +
                '}';
    }
}
