package com.Artur;

import java.util.ArrayList;
import java.util.Scanner;


public class MobilePhone {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<String> contacts = new ArrayList<String >();



    public void addContact(String name, String phoneNumber){
        Contacts contact = new Contacts(name, phoneNumber);
        String tempContact = contact.getContact();
        contacts.add(tempContact);
    }

    public void printContact(){
        System.out.println("The size of phone book is: " + contacts.size()+".");
        for (int i = 0; i < contacts.size(); i++){
            System.out.println( (i+1) +". " + contacts.get(i));
        }
    }

//    private String getName(String name) {
//        return name;
//    }
//
//    public void modifyContact(){
//
//    }
//
//    public void removeContact(){
//
//    }
//
//    public void findContact(){
//
//    }
//
//    public void menu(){
//        quit
//        print list of contacts
//        add new contact (if the user already exists( by username))
//        update contact (if the user already exists(by username))
//        remove contact
//        search/find a contact
//    }



}
