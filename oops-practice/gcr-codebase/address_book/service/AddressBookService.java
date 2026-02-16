package address_book.service;

import java.util.List;

import address_book.model.ContactPerson;

// Business logic contract
public interface AddressBookService {

    boolean createAddressBook(String bookName);

    boolean addContact(String bookName, ContactPerson person);

    boolean editContact(String bookName, String firstName, String lastName,
                        String address, String city, String state,
                        String zip, String phone, String email);

    boolean deleteContact(String bookName, String firstName, String lastName);

    List<ContactPerson> searchPersonByCityOrState(String value);
}
