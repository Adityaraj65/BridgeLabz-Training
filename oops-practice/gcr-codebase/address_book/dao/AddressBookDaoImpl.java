package address_book.dao;

import java.util.ArrayList;
import java.util.List;

import address_book.model.ContactPerson;

// Handles data storage using collection
public class AddressBookDaoImpl implements AddressBookDao {

    private List<ContactPerson> contactList = new ArrayList<>();

    @Override
    public void addContact(ContactPerson person) {
        contactList.add(person);
        System.out.println("Contact added successfully.");
    }
}
