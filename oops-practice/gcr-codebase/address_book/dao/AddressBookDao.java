package address_book.dao;

import address_book.model.ContactPerson;

// DAO contract for data operations
public interface AddressBookDao {
    void addContact(ContactPerson person);
    ContactPerson findByName(String firstName, String lastName);

}
