package ru.geekbrains.courses.java.homework2;

public class square {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int [] [] square = {{0,0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0,0}};
        System.out.println("Table");
        while ( a < 11) {
            while ( b < 11) {
                System.out.print(square [a] [b] + "");
                b++;
            }
            System.out.println(" ");
            b=0;
            a++;
        }
        System.out.println("New One");
        a=0;
        b=0;
        while (a<11) {
            while (b<11){
                if (a==b){
                    square [a] [b] = 1;
                }
                if (a+b == 10){
                    square [a] [b] = 1;
                }
                System.out.print(square [a] [b] + " ");
                b++;
            }
            b=0;
            System.out.println("");
            a++;
        }
    }
}
