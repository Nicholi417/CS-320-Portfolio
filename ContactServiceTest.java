package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactServiceTest {
    @Test
    void testingAllTheGettersAndSetters() throws IllegalAccessException {
        ContactService contactService = new ContactService();
        contactService.setFirstName("Mary");
        contactService.setLastName("Jane");
        contactService.setPhoneNumber("4204200420");
        contactService.setAddress("420 THC ave, Pot Place");

        assertNotNull(contactService.getFirstName());
        assertNotNull(contactService.getLastName());
        assertNotNull(contactService.getAddress());
        assertNotNull(contactService.getPhoneNumber());

    }

}