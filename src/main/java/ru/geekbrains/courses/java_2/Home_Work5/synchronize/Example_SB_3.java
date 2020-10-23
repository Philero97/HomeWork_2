package ru.geekbrains.courses.java_2.Home_Work5.synchronize;

public class Example_SB_3 {
    public static void main(String[] args) {
        System.out.println("Start");
        new Thread(Example_SB_3::method).start();
        new Thread(Example_SB_3::method).start();
    }

    private /*synchronized*/ static void method() {
        synchronized (Example_SB_3.class) {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
