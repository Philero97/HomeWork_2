package ru.geekbrains.courses.java.HomeWork_7;

public class Plate {
    private int food;

    public Plate(int foot) {
        this.food = foot;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void info(){
        System.out.println("Миска: " + food);
    }

    public boolean decreaseFood(int appetite) {
        if (this.food>= appetite) {
            this.food -= appetite;
            System.out.println("Я наелся");
            return true;
        } else {
            System.out.println("Покорми меня");
            return false;
        }
    }

    public void addEat(int eat) {
        this.food += eat;
    }
}
