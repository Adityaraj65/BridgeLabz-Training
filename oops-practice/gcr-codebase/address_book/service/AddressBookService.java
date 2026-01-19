package address_book.service;

import address_book.model.ContactPerson;

// Business layer contract
public interface AddressBookService {
    void addContact(ContactPerson person);
}

