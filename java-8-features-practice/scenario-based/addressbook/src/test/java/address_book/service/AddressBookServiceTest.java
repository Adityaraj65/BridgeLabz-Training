package address_book.service;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import address_book.model.ContactPerson;

class AddressBookServiceTest {

    private AddressBookService service;

    @BeforeEach
    void setUp() {
        service = new AddressBookServiceImpl();
        service.createAddressBook("TestBook");
    }

    // UC-1 + Regex validation
    @Test
    void testAddContact_WithValidData_ShouldPass() {

        ContactPerson person = new ContactPerson(
                "Amit", "Sharma",
                "MG Road", "Pune", "MH",
                "411001", "9876543210",
                "amit@gmail.com"
        );

        assertTrue(service.addContact("TestBook", person));
    }

    // Regex negative test
    @Test
    void testAddContact_WithInvalidEmail_ShouldFail() {

        ContactPerson person = new ContactPerson(
                "Amit", "Sharma",
                "MG Road", "Pune", "MH",
                "411001", "9876543210",
                "amitgmail.com"
        );

        assertFalse(service.addContact("TestBook", person));
    }

    // Duplicate test (UC-6 + UC-7)
    @Test
    void testDuplicateContact_ShouldFail() {

        ContactPerson person1 = new ContactPerson(
                "Amit", "Sharma",
                "MG Road", "Pune", "MH",
                "411001", "9876543210",
                "amit@gmail.com"
        );

        ContactPerson person2 = new ContactPerson(
                "Amit", "Sharma",
                "FC Road", "Pune", "MH",
                "411002", "9999999999",
                "amit2@gmail.com"
        );

        assertTrue(service.addContact("TestBook", person1));
        assertFalse(service.addContact("TestBook", person2));
    }
}

