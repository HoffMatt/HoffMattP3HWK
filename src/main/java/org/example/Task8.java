package org.example;

public class Task8 {
    public static void main(String[] args) {
        //	Maximum and minimum number in the array?

        int[] num = {11, 12, 63, 39, 102, 31, 71, 5, 1, 9};

        int i = num[0];
        int j = num[0];

        for (int n : num) {
            if (i < n) {
                i = n;

            } else if (j > n) {
                j = n;
            }
        }

        System.out.println("The highest number in the array is: " + i);
        System.out.println("the lowest number in the array is: " + j);


    }
}
