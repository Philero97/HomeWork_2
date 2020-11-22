package ru.geekbrains.courses.java_3.HomeWork1;

public class Orange extends Fruit {
    public Orange() { super(1.5f);}

    @Override
    public Fruit newInstance() { return new Orange(); }
}
