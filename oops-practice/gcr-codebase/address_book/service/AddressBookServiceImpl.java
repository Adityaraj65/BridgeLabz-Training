package address_book.service;
import address_book.dao.AddressBookDao;
import address_book.dao.AddressBookDaoImpl;
import address_book.model.ContactPerson;

// Handles business logic
public class AddressBookServiceImpl implements AddressBookService {

    private AddressBookDao dao = new AddressBookDaoImpl();

    @Override
    public void addContact(ContactPerson person) {
        // Validation can be added later
        dao.addContact(person);
    }
}