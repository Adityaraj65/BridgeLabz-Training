package address_book.dao;

import java.util.List;

import address_book.model.ContactPerson;

// Data access contract
public interface AddressBookDao {

    boolean createAddressBook(String bookName);

    boolean addContact(String bookName, ContactPerson person);

    boolean editContact(String bookName, String firstName, String lastName,
                        String address, String city, String state,
                        String zip, String phone, String email);

    boolean deleteContact(String bookName, String firstName, String lastName);

    List<ContactPerson> searchByCityOrState(String value);
}
