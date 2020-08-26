package ru.geekbrains.courses.java.homework2;

public class checkBalance {
    public static void main(String[] args) {
        int separator = 6;
        int [] Arr = {1, 5, 2, 2, 1, 6, 6, 1, 2, 2, 5, 1};
        System.out.println(checker(Arr, separator));
    }

    public static boolean checker(int [] Arr, int separator) {
        int a = 0;
        int left = 0;
        int right = 0;
        while (a< Arr.length){
            if(a<separator){
                left = left + Arr[a];
            } else {
                right = right + Arr[a];
            }
            a++;
        }
        if (left==right){
            return true;
        } else {
            return false;
        }
    }
}
