package org.example;

public class ContactService {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    //all the getters and setters for the variables
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws IllegalAccessException {
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalAccessException("Invalid Description");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws IllegalAccessException {
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalAccessException("Invalid Description");
        }
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws IllegalAccessException {
        if (phoneNumber == null || phoneNumber.length() > 10) {
            throw new IllegalAccessException("Invalid Description");
        }
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) throws IllegalAccessException {
        if (address == null || address.length() > 30) {
            throw new IllegalAccessException("Invalid Description");
        }
        this.address = address;
    }


}
