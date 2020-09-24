package ru.geekbrains.courses.java_2.Home_Work1;

public class Wall {
    private static int wallHeight;
    public Wall (int wallHeight){
        this.wallHeight = wallHeight;
    }
    public boolean doJump(Muving object){
        int height = object.jump();
        return height >= wallHeight;
    }
}
