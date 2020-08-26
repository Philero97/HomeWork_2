package ru.geekbrains.courses.java.homework1;

public class homework1 {
    public static void main(String[] args) {
        // System.out.println("Hello");
        byte bt = 9;
        short sh = 7987;
        int in = 159735458;
        float a = 17.2f;
        float b = 14.5f;
        float c = 7.55f;
        float d = 1.95f;
        double db = -117.117;
        char ch = 'd';
        String st = "ddd";
        boolean bl = false;
        //System.out.println(bl);
        System.out.println(mathExp(a, b, c, d));
        System.out.println(conditionalComparison(9, 7));
        negativeCheck(-12);
        System.out.println(positiveCheck(312));
        outputName("Philipp");
        Year(-215);
    }

    public static float mathExp(float a, float b, float c, float d) {
        var result = a * (b + (c / d));
        return result;
    }

    public static boolean conditionalComparison(int a, int b) {
        int c = a + b;
        boolean result = false;
        if (c >= 10) {
            if (c <= 20) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

    public static void negativeCheck(int num) {
        if (num >= 0) {
            System.out.println("num is positive");
        } else {
            System.out.println("num is negative");
        }

    }

    public static boolean positiveCheck(int number) {
        boolean result = false;

        if (number > 0) {
            result = false;
        } else {
            result = true;
        }
        return result;

    }

    public static void outputName(String name) {
        System.out.println("Hello " + name);

    }

    public static void Year(int year) {
        int f = year % 4;
        int h = year % 100;
        int fh = year % 400;
//        System.out.println(year);
        if (year < 100) {
            if (f == 0) {
                System.out.println("This is leap year");
            } else {
                System.out.println("This year is not leap");
            }
        } else {
            if (year < 400) {
                if (f == 0) {
                    if (h == 0) {
                        System.out.println("This year is not leap");
                    } else {
                        System.out.println("This is leap year");
                    }

                } else {
                    System.out.println("This year is not leap");
                }
            } else {
                if (f == 0) {
                    if (h == 0) {
                        if (fh == 0) {
                            System.out.println("This is leap year");
                        } else {
                            System.out.println("This year is not leap");
                        }
                    } else {
                        System.out.println("This is leap year");
                    }

                } else {
                    System.out.println("This year is not leap");
                }
            }

        }
    }
}
