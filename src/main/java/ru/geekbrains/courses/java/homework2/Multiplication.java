package ru.geekbrains.courses.java.homework2;

public class Multiplication {

    public static void main(String[] args) {
        int a = 0;
        int[] Multiplication = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("First");
        for (Integer c: Multiplication) {
            System.out.print(c + " ");
        }
        System.out.println("");
        System.out.println(" New Multiplication");
        while (a<12){
            if (Multiplication [a] < 6){
                Multiplication [a] = Multiplication [a] * 2;
            }
            System.out.print(Multiplication [a] + " ");
            a++;
        }
    }
}
