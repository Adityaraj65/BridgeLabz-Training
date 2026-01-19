package address_book.presentation;


import java.util.Scanner;

import address_book.model.ContactPerson;
import address_book.service.AddressBookService;
import address_book.service.AddressBookServiceImpl;

// Entry point of application
public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        Scanner sc = new Scanner(System.in);

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

        System.out.print("Phone Number: ");
        String phone = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        ContactPerson person = new ContactPerson(
                firstName, lastName, address,
                city, state, zip, phone, email
        );
        System.out.print("Enter new Address: ");
        String newAddress = sc.nextLine();

        System.out.print("Enter new City: ");
        String newCity = sc.nextLine();

        System.out.print("Enter new State: ");
        String newState = sc.nextLine();

        System.out.print("Enter new Zip: ");
        String newZip = sc.nextLine();

        System.out.print("Enter new Phone: ");
        String newPhone = sc.nextLine();

        System.out.print("Enter new Email: ");
        String newEmail = sc.nextLine();

        AddressBookService service = new AddressBookServiceImpl();
        service.addContact(person);
        service.editContact(firstName, lastName,
                newAddress, newCity, newState,
                newZip, newPhone, newEmail);
        sc.close();
    }
}
