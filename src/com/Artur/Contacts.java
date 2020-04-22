package com.Artur;

public class Contacts extends MobilePhone {
    private String name;
    private String phoneNumber;

    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getContact() {
        return name + " " + phoneNumber;
    }

}
