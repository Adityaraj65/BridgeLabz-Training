package address_book.presentation;

import java.util.List;
import java.util.Scanner;

import address_book.model.ContactPerson;
import address_book.service.AddressBookService;
import address_book.service.AddressBookServiceImpl;

// Console entry point
public class AddressBookMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AddressBookService service = new AddressBookServiceImpl();

        System.out.println("Welcome to Address Book Program");

        System.out.print("Enter Address Book Name: ");
        String bookName = sc.nextLine();

        if (!service.createAddressBook(bookName)) {
            System.out.println("Address Book already exists.");
            sc.close();
            return;
        }

        while (true) {
            System.out.println("\n1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Search by City/State");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addContact(sc, service, bookName);
                    break;

                case 2:
                    editContact(sc, service, bookName);
                    break;

                case 3:
                    deleteContact(sc, service, bookName);
                    break;

                case 4:
                    searchByCityOrState(sc, service);
                    break;

                case 0:
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private static void addContact(Scanner sc, AddressBookService service, String bookName) {

        System.out.print("First Name: ");
        String firstName = sc.nextLine();
        System.out.print("Last Name: ");
        String lastName = sc.nextLine();
        System.out.print("Address: ");
        String address = sc.nextLine();
        System.out.print("City: ");
        String city = sc.nextLine();
        System.out.print("State: ");
        String state = sc.nextLine();
        System.out.print("Zip: ");
        String zip = sc.nextLine();
        System.out.print("Phone: ");
        String phone = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();

        ContactPerson person = new ContactPerson(
                firstName, lastName, address,
                city, state, zip, phone, email
        );

        if (!service.addContact(bookName, person)) {
            System.out.println("Duplicate contact not allowed.");
        }
    }

    private static void editContact(Scanner sc, AddressBookService service, String bookName) {

        System.out.print("First Name: ");
        String firstName = sc.nextLine();
        System.out.print("Last Name: ");
        String lastName = sc.nextLine();

        System.out.print("New Address: ");
        String address = sc.nextLine();
        System.out.print("New City: ");
        String city = sc.nextLine();
        System.out.print("New State: ");
        String state = sc.nextLine();
        System.out.print("New Zip: ");
        String zip = sc.nextLine();
        System.out.print("New Phone: ");
        String phone = sc.nextLine();
        System.out.print("New Email: ");
        String email = sc.nextLine();

        if (!service.editContact(bookName, firstName, lastName,
                address, city, state, zip, phone, email)) {
            System.out.println("Contact not found.");
        }
    }

    private static void deleteContact(Scanner sc, AddressBookService service, String bookName) {

        System.out.print("First Name: ");
        String firstName = sc.nextLine();
        System.out.print("Last Name: ");
        String lastName = sc.nextLine();

        if (!service.deleteContact(bookName, firstName, lastName)) {
            System.out.println("Contact not found.");
        }
    }

    private static void searchByCityOrState(Scanner sc, AddressBookService service) {

        System.out.print("Enter City or State: ");
        String value = sc.nextLine();

        List<ContactPerson> result =
                service.searchPersonByCityOrState(value);

        for (ContactPerson p : result) {
            System.out.println(p);
        }
    }
}
