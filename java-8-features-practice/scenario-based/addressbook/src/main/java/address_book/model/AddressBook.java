package address_book.model;

import java.util.ArrayList;
import java.util.List;

// Represents one Address Book
public class AddressBook {

    private String name;
    private List<ContactPerson> contacts;

    public AddressBook(String name) {
        this.name = name;
        this.contacts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<ContactPerson> getContacts() {
        return contacts;
    }
}
