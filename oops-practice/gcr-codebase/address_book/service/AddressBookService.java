package address_book.service;

import address_book.model.ContactPerson;

// Business layer contract
public interface AddressBookService {
    void addContact(ContactPerson person);
    boolean editContact(String firstName, String lastName,
                        String address, String city, String state,
                        String zip, String phone, String email);

}

