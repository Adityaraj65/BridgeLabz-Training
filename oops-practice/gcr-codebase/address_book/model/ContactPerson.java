package address_book.model;

import java.util.Objects;

// POJO representing a contact
public class ContactPerson {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String email;

    public ContactPerson(String firstName, String lastName,
                         String address, String city, String state,
                         String zip, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }

    // Setters used in UC-2
    public void setAddress(String address) {
        this.address = address;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // UC-7: duplicate check by name
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContactPerson)) return false;
        ContactPerson that = (ContactPerson) o;
        return firstName.equalsIgnoreCase(that.firstName)
                && lastName.equalsIgnoreCase(that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName.toLowerCase(), lastName.toLowerCase());
    }

    @Override
    public String toString() {
        return firstName + " " + lastName +
                " | " + city + ", " + state +
                " | " + phone;
    }
}
