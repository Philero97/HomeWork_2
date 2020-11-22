package ru.geekbrains.courses.java_3.HomeWork1;

public abstract class Fruit {
    protected float weight;

    public abstract Fruit newInstance();

    public float getWeight() { return weight; }

    public Fruit (float weight) { this.weight = weight;}

}
