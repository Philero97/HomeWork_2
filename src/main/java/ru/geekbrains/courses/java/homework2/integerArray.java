package ru.geekbrains.courses.java.homework2;

public class integerArray {

    public static void main(String[] args) {
        int [] i = {1, 0, 1, 1, 0, 1, 4, 0, 1, 0};
        for (Integer d : i) {
            switch (d) {
                case 0 -> System.out.println(i [d] + " ");
                case 1 -> System.out.println(i [d] + " ");
                default -> System.out.println("Wrong");
            }
        }
//        case 1:
//        i [d] = 0;
//        System.out.println(i [d] + " ");
//        break;
//        case 0:
//        i [d] = 1;
//        System.out.println(i [d] + " ");
//        break;
//        default:
//        System.out.println("Wrong");
//        break;
//    }
}
}
