package ru.geekbrains.courses.java.homework2;

public class Array {

    public static void main(String[] args) {
        int a = 0;
        int[] arr = new int[8];
        int[] Array = {0, 3, 6, 9, 12, 15, 18, 21};
        while ( a< arr.length){
            arr [a] = Array [a];
            System.out.println(arr [a] + " ");
            a++;
        }

    }
}
