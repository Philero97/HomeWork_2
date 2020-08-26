package ru.geekbrains.courses.java.homework2;

public class MinMax {

    public static void main(String[] args) {
        int a = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int [] arr = {3,17,-254,922,78,-24,-667,1345,953,-312,2467,645};
        while (a< arr.length){
            if (arr [a] > max){
                max = arr [a];
            }
            if (arr [a] < min) {
                min = arr[a];
            }
            a++;
        }
        System.out.println("max " + max);
        System.out.println("min " + min);
    }
}
