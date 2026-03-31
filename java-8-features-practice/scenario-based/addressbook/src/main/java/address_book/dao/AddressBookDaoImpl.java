package address_book.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import address_book.model.AddressBook;
import address_book.model.ContactPerson;

// Handles all data using collections
public class AddressBookDaoImpl implements AddressBookDao {

    // UC-5: Dictionary of AddressBook name → AddressBook
    private Map<String, AddressBook> addressBookMap = new HashMap<>();

    @Override
    public boolean createAddressBook(String bookName) {
        if (addressBookMap.containsKey(bookName)) {
            return false;
        }
        addressBookMap.put(bookName, new AddressBook(bookName));
        return true;
    }

    // UC-1, UC-4, UC-6, UC-7
    @Override
    public boolean addContact(String bookName, ContactPerson person) {
        AddressBook book = addressBookMap.get(bookName);
        if (book == null) return false;

        if (book.getContacts().contains(person)) {
            return false; // duplicate
        }
        book.getContacts().add(person);
        return true;
    }

    // UC-2
    @Override
    public boolean editContact(String bookName, String firstName, String lastName,
                               String address, String city, String state,
                               String zip, String phone, String email) {

        AddressBook book = addressBookMap.get(bookName);
        if (book == null) return false;

        for (ContactPerson person : book.getContacts()) {
            if (person.getFirstName().equalsIgnoreCase(firstName)
                    && person.getLastName().equalsIgnoreCase(lastName)) {

                person.setAddress(address);
                person.setCity(city);
                person.setState(state);
                person.setZip(zip);
                person.setPhone(phone);
                person.setEmail(email);
                return true;
            }
        }
        return false;
    }

    // UC-3
    @Override
    public boolean deleteContact(String bookName, String firstName, String lastName) {

        AddressBook book = addressBookMap.get(bookName);
        if (book == null) return false;

        Iterator<ContactPerson> iterator = book.getContacts().iterator();
        while (iterator.hasNext()) {
            ContactPerson person = iterator.next();
            if (person.getFirstName().equalsIgnoreCase(firstName)
                    && person.getLastName().equalsIgnoreCase(lastName)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    // UC-8
    @Override
    public List<ContactPerson> searchByCityOrState(String value) {

        List<ContactPerson> result = new ArrayList<>();

        for (AddressBook book : addressBookMap.values()) {
            for (ContactPerson person : book.getContacts()) {
                if (person.getCity().equalsIgnoreCase(value)
                        || person.getState().equalsIgnoreCase(value)) {
                    result.add(person);
                }
            }
        }
        return result;
    }
}
