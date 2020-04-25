package com.Artur;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone contacts = new MobilePhone();

    public static void main(String[] args) {
        contacts.addContact("Mudak", "21111111111");

        boolean flag = false;
        menu();

        while (flag != true){
            System.out.print("\nWhat you want to do? Enter number: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if(!flag){
                switch(choice){
                    case 1:
                        menu();
                        break;
                    case 2:
                        contacts.printContact();
                        break;
                    case 3:
                        add();
                        break;
                    case 4:
                        update();
                        break;
                    case 5:
                        delete();
                        break;
                    case 6:
                        find();
                        break;
                    case 0:
                        flag = true;
                        break;
                }
            }
        }

//        contacts.addContact("Artur", "29883372");
//        contacts.addContact("Kate", "29883372");
//        contacts.addContact("Eva", "29883372");
//        contacts.addContact("Mudak", "21111111111");


//        contacts.printContact();
//        contacts.findContact("muDak");
//        contacts.removeContact("mudak");
//        contacts.printContact();
//        contacts.modifyContact("mudak", "398874145");
//        contacts.printContact();

    }
    public static void add(){
        System.out.print("\nPlease enter name: ");
        String addName = scanner.nextLine();
        System.out.print("Please enter phone number: ");
        String addPhoneNumber = scanner.nextLine();
        contacts.addContact(addName, addPhoneNumber);
    }

    public static void update(){
        System.out.print("Please enter new name: ");
        String newName = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Please enter new phone number: ");
        String newPhoneNumber = scanner.nextLine();
        contacts.modifyContact(newName, newPhoneNumber);
    }

    public static void delete(){
        System.out.print("Please enter contact name you want to delete: ");
        String deleteNewName = scanner.nextLine();
        scanner.nextLine();
        contacts.removeContact(deleteNewName);
    }

    public static void find(){
        System.out.println("Please enter contact name you want to find: ");
        String findName = scanner.nextLine();
        scanner.nextLine();
        contacts.findContact(findName);
    }

    public static void menu(){
        System.out.println("   Please make your choice: ");
        System.out.println("0. Quit");
        System.out.println("1. Print menu.");
        System.out.println("2. Print list of contacts.");
        System.out.println("3. Add a new contact."); //(if the user already exists( by username))
        System.out.println("4. Update contact information;");   //update contact (if the user already exists(by username))
        System.out.println("5. Remove contact.");
        System.out.println("6. Find a contact in address book.\n");
    }


}
