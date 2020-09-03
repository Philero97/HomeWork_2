package ru.geekbrains.courses.java.HomeWork_5;

public class Worker {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Worker (String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }


    public void printWorker() {
        System.out.println("ФИО: " + this.fullName);
        System.out.println("Должность :" + this.position);
        System.out.println("Почта :" + this.email);
        System.out.println("Телефон :" + this.phoneNumber);
        System.out.println("Заработная плата:" + this.salary);
        System.out.println("Возраст :" + this.age);
    }

    public int getAge() {
        return this.age;
    }
}