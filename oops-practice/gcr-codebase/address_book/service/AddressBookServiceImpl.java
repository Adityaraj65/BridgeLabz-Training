package address_book.service;

import java.util.List;

import address_book.dao.AddressBookDao;
import address_book.dao.AddressBookDaoImpl;
import address_book.model.ContactPerson;

// Service = rules + delegation
public class AddressBookServiceImpl implements AddressBookService {

    private AddressBookDao dao = new AddressBookDaoImpl();

    @Override
    public boolean createAddressBook(String bookName) {
        return dao.createAddressBook(bookName);
    }

    @Override
    public boolean addContact(String bookName, ContactPerson person) {
        return dao.addContact(bookName, person);
    }

    @Override
    public boolean editContact(String bookName, String firstName, String lastName,
                               String address, String city, String state,
                               String zip, String phone, String email) {
        return dao.editContact(bookName, firstName, lastName,
                address, city, state, zip, phone, email);
    }

    @Override
    public boolean deleteContact(String bookName, String firstName, String lastName) {
        return dao.deleteContact(bookName, firstName, lastName);
    }

    @Override
    public List<ContactPerson> searchPersonByCityOrState(String value) {
        return dao.searchByCityOrState(value);
    }
}
