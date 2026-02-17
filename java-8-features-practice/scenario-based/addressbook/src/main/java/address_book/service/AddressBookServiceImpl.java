package address_book.service;

import java.util.List;

import address_book.dao.AddressBookDao;
import address_book.dao.AddressBookDaoImpl;
import address_book.model.ContactPerson;

// Service = rules + delegation
public class AddressBookServiceImpl implements AddressBookService {

    // ✅ Regex constants MUST be inside class
    private static final String NAME_REGEX = "^[A-Z][a-z]{2,}$";
    private static final String PHONE_REGEX = "^[0-9]{10}$";
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
    private static final String ZIP_REGEX = "^[0-9]{5,6}$";

    private AddressBookDao dao = new AddressBookDaoImpl();

    @Override
    public boolean createAddressBook(String bookName) {
        return dao.createAddressBook(bookName);
    }

    @Override
    public boolean addContact(String bookName, ContactPerson person) {

        // Regex validations
        if (!person.getFirstName().matches(NAME_REGEX)) {
			return false;
		}
        if (!person.getLastName().matches(NAME_REGEX)) {
			return false;
		}
        if (!person.getPhone().matches(PHONE_REGEX)) {
			return false;
		}
        if (!person.getEmail().matches(EMAIL_REGEX)) {
			return false;
		}
        if (!person.getZip().matches(ZIP_REGEX)) {
			return false;
		}

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
