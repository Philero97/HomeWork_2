package ru.geekbrains.courses.java_2.Home_Work3;

import java.util.Set;

public class Task2 {

    public static void main(String[] args) {
        IPhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Eremin", "777-77-77");
        phoneBook.add("Pankov", "555-55-55");
        phoneBook.add("Drozdov", "666-66-66");
        phoneBook.add("Lebed", "888-88-88");
        phoneBook.add("Eremin", "777-77-77");

        Set<String> allSurnames = phoneBook.getAllSurnames();
        for (String surname : allSurnames) {
            Set<String> phones = phoneBook.get(surname);
            System.out.printf("%s: %s%n", surname, phones);
        }
    }


}
