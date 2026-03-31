import java.util.ArrayList;

public class PhoneContactOrganizer {
    public static void main(String[] args) {
        ContactOrganizer m = new ContactOrganizer();

        try {
            m.addContact("Aditya", 1234567891);
            m.addContact("Rahul", 1876543210);
            m.addContact("Duplicate", 1234567891); // duplicate
            m.addContact("Invalid", 123);     // invalid roll
        } catch (InvalidPhoneNumberException e) {
            // Exception handling keeps program stable
            System.out.println("Error: " + e.getMessage());
        }

        m.searchContact(1234567891);
        m.deleteContact(12345);
        m.searchContact(12345);
    }
}


class InvalidPhoneNumberException extends Exception {
    InvalidPhoneNumberException(String message) {
        super(message);
    }
}

class ContactOrganizer {
    ArrayList<Contact> contact = new ArrayList<>();

    void addContact(String name, long phoneNumber) throws InvalidPhoneNumberException {
        String numberString = String.valueOf(phoneNumber);
        if (numberString.length() != 10) {
            throw new InvalidPhoneNumberException("Phone number must be exactly of 10 digit");
        }
        for (Contact c : contact) {
            if (c.phoneNumber == phoneNumber) {
                System.out.println("Duplicate contact not allowed");
                return;
            }
        }

        Contact newContact = new Contact(name, phoneNumber);
        contact.add(newContact);
        System.out.println("New Contact Added");
    }

    void searchContact(long phoneNumber) {

        for (Contact s : contact) {
            // If matching roll number found
            if (s.phoneNumber == phoneNumber) {
                System.out.println("contact Found");
                System.out.println("Name: " + s.name);
                System.out.println("Roll: " + s.phoneNumber);
                return;
            }
        }

        // If loop finishes without return
        System.out.println("Phone number  not found");
    }

    void deleteContact(long phoneNumber) {

        for (int i = 0; i < contact.size(); i++) {

            // Get student object at index i
            Contact s = contact.get(i);

            if (s.phoneNumber == phoneNumber) {
                contact.remove(i); // Safe removal
                System.out.println("contact deleted");
                return;
            }
        }

        System.out.println("contact not found, cannot delete");
    }
}

class Contact {
    String name;
    long phoneNumber;

    Contact(String name, long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}