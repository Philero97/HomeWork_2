package ru.geekbrains.courses.java.HomeWork_7;

public class Cat {

    private final  String name;
    private final  int appetite;
    private boolean hunger;

    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.hunger = false;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isHunger() {
        return hunger;
    }


    public void eat(Plate plate){
        if (hunger == false) {
            if (plate.decreaseFood(appetite)) {
                this.hunger = true;
            }
        } else System.out.println("Я не голоден");
    }

}
