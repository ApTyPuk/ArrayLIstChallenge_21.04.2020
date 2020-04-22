package com.Artur;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private Scanner scanner = new Scanner(System.in);
    private static MobilePhone contacts = new MobilePhone();

    public static void main(String[] args) {

        contacts.addContact("Artur", "29883372");
        contacts.printContact();

    }
}
