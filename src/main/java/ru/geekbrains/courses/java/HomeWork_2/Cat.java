package ru.geekbrains.courses.java.HomeWork_6;

public class Cat extends Animal{
    private String name;
    private String color;
    private int age;
    private int rundistance;
    private int swimdistance;
    private double jumpdistance;

    public Cat (String name, String color, int age){
        super(name, color, age);
        this.rundistance = 200;
        this.jumpdistance = 2;
    }


    public Cat (String name, String color, int age, int rundistance, int swimdistance, double jumpdistance) {
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

    public void swim(int distance) {
        System.out.println("Я не умею плавать");

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
        meow();
    }

    public void meow(){
        System.out.println("Мяу");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", Rundistance= " + rundistance +
                ", Swimdistance= " + swimdistance +
                ", Jumpdistance= " + jumpdistance +
                '}';
    }
}
