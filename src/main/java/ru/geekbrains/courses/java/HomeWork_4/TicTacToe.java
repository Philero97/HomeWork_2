package ru.geekbrains.courses.java.HomeWork_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    private static final char DOT_EMPTY = '.';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';

    private static final int SIZE = 5;
    private static char [][] map = new char[SIZE][SIZE];
    private static final int DOTS_TO_WIN = 4;

    public static final Scanner scanner = new Scanner(System.in);
    public static final Random random = new Random();

    public static void main(String[] args) {
        initMap ();
        printMap();
        do {
            humanTurn();
            printMap();
            if (isWin(DOT_X)) {
                System.out.println("Вы победили!!");
                break;
            }

            iiTurn();
            printMap();
            if (isWin(DOT_O)) {
                System.out.println("Вы проиграли!!");
                break;
            }
            if (mapFull()){
                System.out.println("Ничья");
                break;
            }
        } while (true);
    }

    private static boolean isWin(char symbol) {

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map [i] [j] == symbol) {
                    if ( checkLeft(i,j) || checkRight (i, j) || checkUp(i, j) || checkDown (i, j) || checkLeftUp (i, j) || checkLeftDown (i, j) || checkRightUp (i, j) || checkRightDown ( i, j)) {
                        return true;
                    }
                }
            }
        }
        return false;

    }

    private static boolean checkUp (int i, int j) {
        int token = 1;
        while (chekPosition((i+1), j)) {
            if (map [i] [j] == map [i+1] [j]){
                token ++;
                if (token >=DOTS_TO_WIN) return true;
                i ++;
            } else break;
        }
        return false;
    }
    private static boolean checkDown (int i, int j) {
        int token = 1;
        while (chekPosition((i-1), j)) {
            if (map [i] [j] == map [i-1] [j]){
                token ++;
                if (token >=DOTS_TO_WIN) return true;
                i --;
            } else break;
        }
        return false;
    }
    private static boolean checkRight (int i, int j) {
        int token = 1;
        while (chekPosition(i, (j+1))) {
            if (map [i] [j] == map [i] [j+1]){
                token ++;
                if (token >=DOTS_TO_WIN) return true;
                j ++;
            } else break;
        }
        return false;
    }
    private static boolean checkLeft (int i, int j) {
        int token = 1;
        while (chekPosition(i, (j-1))) {
            if (map [i] [j] == map [i] [j-1]){
                token ++;
                if (token >=DOTS_TO_WIN) return true;
                j --;
            } else break;
        }
        return false;
    }
    private static boolean checkRightDown (int i, int j) {
        int token = 1;
        while (chekPosition((i+1), (j+1))) {
            if (map [i] [j] == map [i+1] [j+1]){
                token ++;
                if (token >=DOTS_TO_WIN) return true;
                i ++;
                j ++;
            } else break;
        }
        return false;
    }
    private static boolean checkRightUp (int i, int j) {
        int token = 1;
        while (chekPosition((i-1), (j+1))) {
            if (map [i] [j] == map [i-1] [j+1]){
                token ++;
                if (token >=DOTS_TO_WIN) return true;
                i --;
                j ++;
            } else break;
        }
        return false;
    }
    private static boolean checkLeftDown (int i, int j) {
        int token = 1;
        while (chekPosition((i+1), (j-1))) {
            if (map [i] [j] == map [i+1] [j-1]){
                token ++;
                if (token >=DOTS_TO_WIN) return true;
                i ++;
                j --;
            } else break;
        }
        return false;
    }
    private static boolean checkLeftUp (int i, int j) {
        int token = 1;
        while (chekPosition((i-1), (j-1))) {
            if (map [i] [j] == map [i-1] [j-1]){
                token ++;
                if (token >=DOTS_TO_WIN) return true;
                i --;
                j --;
            } else break;
        }
        return false;
    }


    private static boolean chekPosition ( int i, int j) {
        if (i<map.length && i >= 0 && j<map.length && j >= 0) {
            return true;
        } else return false;
    }

    public static void printMap() {
        printColumnNumbers();
        System.out.println();
        printRows();
        System.out.println();
    }

    private static boolean mapFull() {
        for (char[] row: map) {
            for (char cell : row) {
                if (cell == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void printRows() {
        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void printColumnNumbers() {
        for (int i = 0; i<= SIZE; i++){
            System.out.print(i + " ");
        }
    }

    private static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++)
            Arrays.fill(map[i], DOT_EMPTY);
    }

        private static void humanTurn() {
        int rowIndex = -1, colIndex = -1;
        do {
            System.out.println("Введите координаты X Y");
            String[] stringLine = scanner.nextLine().split(" ");
            if (stringLine.length != 2) {
                continue;
            }
            try {
                rowIndex = Integer.parseInt(stringLine[0]) - 1;
                colIndex = Integer.parseInt(stringLine[1]) - 1;
            } catch (NumberFormatException e){
                System.out.println("Введите координаты в числовом формате");
            }
        } while (!isCellValid(rowIndex, colIndex));

        map [rowIndex] [colIndex] = DOT_X;
    }

    private static boolean isCellValid(int rowIndex, int colIndex) {
        if (rowIndex <0 || rowIndex >= SIZE || colIndex < 0 || colIndex >= SIZE) {
            return false;
        }
        return map[rowIndex][colIndex] == DOT_EMPTY;
    }

    private static void iiTurn() {
        int rowIndex, colIndex;
        do {
            rowIndex = random.nextInt(SIZE);
            colIndex = random.nextInt(SIZE);
        }while (!isCellValid(rowIndex, colIndex));
        map [rowIndex] [colIndex] = DOT_O;
    }


}

