package ru.geekbrains.courses.java.HomeWork_6;

public class Dog extends Animal {
    private String name;
    private String color;
    private int age;
    private int rundistance;
    private int swimdistance;
    private double jumpdistance;

    public Dog (String name, String color, int age){
        super(name, color, age);
        this.rundistance = 500;
        this.swimdistance = 10;
        this.jumpdistance = 0.5;
    }


    public Dog (String name, String color, int age, int rundistance, int swimdistance, double jumpdistance){
        super(name, color, age);
        this.jumpdistance = jumpdistance;
        this.rundistance = rundistance;
        this.swimdistance = swimdistance;
    }

    @Override
    public void run(int distance) {
        if (distance <= rundistance){
            super.run(distance);
        }
        else{
            System.out.println("Я не могу пробежать так много");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= swimdistance){
            super.swim(distance);
        }
        else {
            System.out.println("Я не могу плавать так далеко");
        }
    }

    @Override
    public void jump(double height) {
        if (height<=jumpdistance){
            super.jump(height);}
        else{
            System.out.println("Я не способен прыгнуть так высоко");
        }
    }

    @Override
    public void voice() {
        super.voice();
        bark();
    }

    public void bark(){
        System.out.println("Гав");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", Rundistance= " + rundistance +
                ", Swimdistance= " + swimdistance +
                ", Jumpdistance= " + jumpdistance +
                '}';
    }
}
