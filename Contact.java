package org.example;
import java.util.Scanner;

public class Contact {
    public static void contact(String[] args) throws IllegalAccessException {
        ContactService contactService = new ContactService();
        Scanner sn = new Scanner(System.in);
        String firstName;
        String lastName;
        String phoneNumber;
        String address;

        System.out.println("What is your first name?");
        firstName = sn.nextLine();
        contactService.setFirstName(firstName);

        System.out.println("What is your last name?");
        lastName = sn.nextLine();
        contactService.setLastName(lastName);

        System.out.println("What is your phone number?");
        phoneNumber = sn.nextLine();
        contactService.setAddress(phoneNumber);

        System.out.println("What is your address?");
        address = sn.nextLine();
        contactService.setAddress(address);

        System.out.println(contactService.getFirstName());
        System.out.println(contactService.getLastName());
        System.out.println(contactService.getPhoneNumber());
        System.out.println(contactService.getAddress());
    }
}