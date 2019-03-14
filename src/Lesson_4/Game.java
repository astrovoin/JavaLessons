package Lesson_4;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static int size = 3;
    public static int dot_to_win = 3;
    public static final char dot_empty = '.';
    public static final char dot_x = 'X';
    public static final char dot_o = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println("Игра крестики-нолики с компьютером. Добро пожаловать. ");
        initMap();
        printMap();

        while (true) {
           turnHuman();
            printMap();
            if (checkWin(dot_x)) {
                System.out.println("Ты победил");
                break;
            }
            if (isFullMap()) {
                System.out.println("Ничья");
                break;
            }
           turnAi();
            printMap();
            if (checkWin(dot_o)) {
                System.out.println("Победил Компьютер");
                break;
            }
            if (isFullMap()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");

    }
    public static boolean checkWin(char symb) {

        int diag1 = 0;
        int diag2 = 0;
        int vert3=0;
        int vert2=0;
        int vert1=0;
        int gor1=0;
        int gor2=0;
        int gor3=0;

        //горизонтали 1
        for(int str = 0, bkw = map.length - 1; str < map.length; str++, bkw--) {
            if( map[str][bkw] == symb) {
                ++diag1;
            }
        }
        if (diag1==dot_to_win){ return true;}

        //горизонтали 2
        for(int str = 0, bkw = map.length - 1; str < map.length; str++, bkw--) {
            if( map[str][str] == symb) {
                ++diag2;
            }
        }
        if (diag2==dot_to_win){ return true;}

        // по вертикали 3й
                  for (int str = 0, bkw = map.length-1; str < map.length; str++){
               if( map[str][bkw] == symb) {
                   ++vert3;
               }
         }
        if (vert3==dot_to_win){ return true;}

        // по вертикали 2й
         for (int str = 0, bkw = map.length-2; str < map.length; str++){
             if(map[str][bkw] == symb){
                 ++vert2;
             }
            }
        if (vert2==dot_to_win){ return true;}

        // по вертикали 1й
               for (int str = 0, bkw = map.length-3; str < map.length; str++){
                   if( map[str][bkw] == symb){
                       ++vert1;
                   }
               }
        if (vert1==dot_to_win){ return true;}

        // по горизонтали 3й
           for (int str = 0, bkw = map.length-2; str < map.length; str++) {
               if (map[bkw][str] == symb) {
                   ++gor3;
               }
           }
        if (gor3==dot_to_win){ return true;}

        // по горизонтали 2й
             for (int str = 0, bkw = map.length-2; str < map.length; str++) {
                 if (map[bkw][str] == symb) {
                     ++gor2;
                 }
             }
        if (gor2==dot_to_win){ return true;}

        // по горизонтали 1й
              for (int str = 0, bkw = map.length-3; str < map.length; str++){
                if(map[bkw][str] == symb){
                    ++gor1;
                }
             }
        if (gor1==dot_to_win){ return true;}

        return false;
    }


    public static void turnHuman() {
        int x, y;
        do {
            System.out.println("Введите координаты X Y:");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (isValid(x,y) == false);
        map[y][x] = dot_x;
    }

    public static void turnAi(){
        int x, y;
        do {
            x = rand.nextInt(size);
            y = rand.nextInt(size);
        } while (isValid(x,y) == false);
        map[y][x] = dot_o;
    }

    public static boolean isValid (int x, int y){
        if (x < 0 || x > size || y < 0 || y > size) return false;
        if (map[y][x] == dot_empty) return  true;
        return false;
    }

    public static boolean isFullMap () {
        for (int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if (map[i][j] == dot_empty) return false;
            }
        }
        return true;
    }

    public static void initMap() {
        map = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = dot_empty;
            }
        }

    }


    public static void printMap() {
        for (int i = 0; i <= size; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < size; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

}
