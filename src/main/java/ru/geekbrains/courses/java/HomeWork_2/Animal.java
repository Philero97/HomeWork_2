package ru.geekbrains.courses.java.HomeWork_6;

public class Animal {
    private String name;
    private String color;
    private int age;

    public Animal (String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void jump (double height){
        System.out.println("Высота прыжка =" + height);
    }

    public void run (int distance){
        System.out.println("Дистанция бега =" + distance);
    }

    public void swim (int distance){
        System.out.println("Дальность заплыва =" + distance);
    }
    public void voice(){
        System.out.println("Животное издало звук");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
