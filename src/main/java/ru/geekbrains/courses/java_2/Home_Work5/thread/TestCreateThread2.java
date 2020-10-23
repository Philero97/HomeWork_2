package ru.geekbrains.courses.java_2.Home_Work5.thread;

public class TestCreateThread2 {

    static class MyThread extends Thread {
        public MyThread(Runnable runnable) {
            super(runnable);
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(100);
                    System.out.printf("%s: %d%n", Thread.currentThread().getName(), i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        new MyThread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Another thread!");
            }
        }).start();
    }


}
