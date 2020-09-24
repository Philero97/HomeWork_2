package ru.geekbrains.courses.java_2.Home_Work1;

public class MainHWOne {
    public static void main(String[] args) {
        Cat br = new Cat("Барсик", ((int) (75*Math.random())+1),((int) (5*Math.random())+1));
        Human hum = new Human("Human", ((int) (100*Math.random())+1),((int) (3*Math.random())+1));
        Robot rb = new Robot("Robot", ((int) (150*Math.random())+1),((int) (10*Math.random())+1));
        Muving [] object = new Muving[] {br, hum, rb};

        Treadmill[] track = new Treadmill[3];
        for (int i = 0; i<track.length;i++) {
            track [i] = new Treadmill(((int) (110*Math.random())));
        }
        Wall[] wall = new Wall[5];
        for (int i = 0; i<wall.length;i++){
            wall [i] = new Wall(((int) (10*Math.random())));
        }


        run(object, track,wall);
    }

    private static void run(Muving[] object, Treadmill[] treadmill, Wall[] wall){
        for (int i = 0; i < object.length;i++) {
            System.out.print(object[i].getName() + " ");
            for (int j = 0;j<treadmill.length;j++) {
                System.out.print(" do run mill " + j + ":");
                System.out.print(treadmill[j].doRun(object[i]));
            }
            System.out.println(" ");
            for (int j = 0;j<wall.length;j++) {
                System.out.print(" do jump wall " + j + ":");
                System.out.print(wall[j].doJump(object[i]));
            }
            System.out.println(" ");
        }

    }
}
