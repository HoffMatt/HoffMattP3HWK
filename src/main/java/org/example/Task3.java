package org.example;

public class Task3 {
    //Create a 2D array or integer type where you will store odd and even numbers. Develop a program which
    //will identify/print the even numbers only.
    public static void main(String[] args) {


        int[][] arr = {
                {10, 30, 40, 50},
                {22, 60, 90, 65},
                {15, 50, 80, 30}
        };


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] % 20 == 0) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();

        }
    }
}