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
    @Override
    public boolean editContact(String firstName, String lastName,
                               String address, String city, String state,
                               String zip, String phone, String email) {

        ContactPerson person = dao.findByName(firstName, lastName);

        if (person == null) {
            return false;
        }

        person.setAddress(address);
        person.setCity(city);
        person.setState(state);
        person.setZip(zip);
        person.setPhoneNumber(phone);
        person.setEmail(email);

        return true;
    }

}