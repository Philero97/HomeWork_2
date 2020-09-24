package ru.geekbrains.courses.java_2.Home_Work1;

public class Human implements Muving {
    private static String name;
    private static int runDistance;
    private static int jumpHeing;
    public Human(String name, int runDistance, int jumpHeing){
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeing = jumpHeing;
    }


    @Override
    public int jump() {
        return this.jumpHeing;
    }

    @Override
    public int run() {
        return this.runDistance;
    }

    @Override
    public  String getName() {
        return name;
    }

}