package ru.geekbrains.courses.java.HomeWork_6;

public class main {
    public static void main(String[] args) {
        Animal mursic = new Cat("mursic", "brown", 7,200,7,2);
        Animal shustric = new Dog("shustric", "grey", 4, 500, 25,  1.5);
        Animal zhulic = new Dog("zhulic", "black", 5, 500,25, 1.5);
        Animal bars = new Cat("bars", "orange", 9, 200,12,2);
        Animal Zhel = new Animal("Zhel","green", 12);



        mursic.run(175);
        mursic.jump(1.25);
        mursic.voice();
        System.out.println("-------");


        shustric.run(450);
        shustric.jump(0.75);
        shustric.swim(15);
        shustric.voice();
        System.out.println("-------");


        zhulic.run(175);
        zhulic.jump(0.5);
        zhulic.swim(20);
        zhulic.voice();
        System.out.println("-------");


        bars.run(165);
        bars.jump(1.75);
        bars.swim(12);
        bars.voice();
        System.out.println("-------");

        Zhel.run(250);
        Zhel.swim(12000);
        Zhel.jump(2.5);
        Zhel.voice();
    }
}
