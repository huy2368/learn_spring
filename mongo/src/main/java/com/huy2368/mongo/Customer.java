package com.huy2368.mongo;

import org.springframework.data.annotation.Id;

public class Customer {
    @Id
    private String id;

    public String firstName;
    public String lastName;

    public Customer() {}

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Customer [firstName=" + firstName + ", id=" + id + ", lastName=" + lastName + "]";
    }
    
}
