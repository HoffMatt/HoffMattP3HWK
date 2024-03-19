package org.example;

public class Task4 {
    public static void main(String[] args) {
        //Create a 2D array of integers. Develop a program which will calculate the sum of
        // even and odd numbers for that array.

        int[][] arr = {
                {10, 23, 40, 51},
                {22, 40, 90, 65},
                {15, 57, 32, 30}
        };

        int evens = 0;
        int odds = 0;
        for (int[] n : arr) {
            for (int i : n) {
                if ((i % 2) == 0) {
                    evens += i;
                } else {
                    odds += i;
                }

            }
        }

        System.out.println("Sum of Even: " + evens);
        System.out.println("Sum of Odd: " + odds);
    }
}
