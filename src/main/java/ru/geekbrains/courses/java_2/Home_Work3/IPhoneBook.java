package ru.geekbrains.courses.java_2.Home_Work3;

import java.util.Set;

public interface IPhoneBook {

    void add(String surname, String phoneNumber);

    Set<String> get(String surname);

    Set<String> getAllSurnames();
}
