package Lesson_2;

import java.util.Arrays;

public class Main {
    public static void main(String args[]) {


        invertArray();
        fillArray();
        changeArray();
        fillDiagonal(4);
        fillDiagonalTwo();
        maxElement();

    }

    public static void invertArray() {
        System.out.print("Задание 1, инвертация элементов массива: ");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void fillArray() {
        System.out.print("Задание 2, заполнение массива: ");
        int[] arr = new int[8];
        arr[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + 3;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void changeArray() {
        System.out.print("Задание 3, умножить на 2 числа меньше 6: ");
        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < w.length; i++) {
            if (w[i] < 6) {
                w[i] = w[i] * 2;
            }
            System.out.print(w[i] + " ");
        }
        System.out.println();
    }

    public static void fillDiagonal(int razmer) {
        System.out.println("Задание 4, заполнить диагональ массива:");
        int[][] arr = new int[razmer][razmer];
        for (int i = 0; i < razmer; i++) {
            for (int j = 0; j < razmer; j++) {
                if (i == j) arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

// не знаю как реализовать заполнение только диагоналей (с двух сторон), поэтому сделал так.
    // Но это будет работатьтолько в частном случае

    public static void fillDiagonalTwo() {
        System.out.println("Задание 4.1, заполнить диагонали массива:");
        int n = 3;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) arr[i][j] = 1;
                else if (i == 0 && j == arr.length - 1) arr[i][j] = 1;
                else if (i == arr.length - 1 && j == 0) arr[i][j] = 1;
                else arr[i][j] = 0;

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void maxElement() {
        int[] arr ={3,5,6,4,8,2};
        int min = arr[0];
        int max = arr[0];
        System.out.println("Задание 5, Поиск min и max в массиве: " + Arrays.toString(arr));
        for (int arrnum : arr){
            if (arrnum < min) min = arrnum;
            if (arrnum > max) max = arrnum;
        }
        System.out.print("Max: " + min + ", Min: " + max);
    }

  /*  public static boolean checkBalance(int [] arr){
        int sum = 0;
            for (int i = 0; i<=arr.length-i; i++){
                sum = arr[]
            }
        return true;
    } */

}
