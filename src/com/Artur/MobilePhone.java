package com.Artur;

import java.util.ArrayList;


public class MobilePhone {
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
    
    public void modifyContact(String name, String phoneNumber){
        if (find(name) >= 0 ){
            String[] tempArray = (contacts.get(find(name))).split(" ");

            tempArray[0] = name;
            tempArray[1] = phoneNumber;

            contacts.set(find(name), String.join(" ", tempArray));
        }
    }

    public void removeContact(String name){
        if(find(name) >= 0){
            System.out.println("Contact '" + name + "' deleted from contact list.");
            contacts.remove(find(name));
        } else{
            System.out.println("No such contact. Can not delete.");
        }

    }

    private int find(String name){
        for(int i = 0; i < contacts.size(); i++){
            String[] tempArray = (contacts.get(i)).split(" ");  // getting array [Artur, 29883372]
            String tempName = tempArray[0];
            if ((name.toLowerCase()).equals(tempName.toLowerCase())){
                return i;
            }
        }
        return -1;
    }

    public void findContact(String name){
        if (find(name) > 0){
            System.out.println("Contact '" + name +"' found in contact list.");
        } else{
            System.out.println("Contact '" + name +"' not found.");
        }
    }








}
