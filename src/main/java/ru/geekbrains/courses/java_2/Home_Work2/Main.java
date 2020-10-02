package ru.geekbrains.courses.java_2.Home_Work2;
import java.text.NumberFormat;
import java.text.ParsePosition;

public class Main {

    public static void main(String[] args) {
        String [][] arr = new String[][] {{"1","2","t","4"},{"1","2","3","4"},{"1","2","g","4"},{"1","geronimo","3","4"}};
        String [][] arrFive = new String[5][5];
        String [][] arrCheck = new String[][]{{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}};

        try {
            System.out.println(arrayConverter(arr));
        } catch (MyArraySizeException e){
            System.out.println("В метод поступает массив больше, чем 4х4.");
        } catch (MyArrayDataException e){
            System.out.println("В элементе i: " + e.geti() + " j: " + e.getj() + " массива хранится недопустимый символ!");
        }

        System.out.println("Finish!");
    }

    public static int arrayConverter (String [][] arr){
        int sum = 0;
        if (arr.length !=4 && arr[0].length != 4) throw new MyArraySizeException();

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j<arr[0].length;j++){
                if (isNumeric(arr[i][j]) == false) throw new MyArrayDataException(i, j);
                sum += Integer.valueOf(arr[i][j]);
            }
        }

        return sum;
    }

    public static boolean isNumeric(String str)
    {
        NumberFormat formatter = NumberFormat.getInstance();
        ParsePosition pos = new ParsePosition(0);
        formatter.parse(str, pos);
        return str.length() == pos.getIndex();
    }

}
