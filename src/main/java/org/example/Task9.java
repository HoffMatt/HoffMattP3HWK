package org.example;

public class Task9 {
    public static void main(String[] args) {
        // 9.	Write a java program to find the second largest number in the array?
        int[] num = {11, 34, 32, 5, 45, 91, 9, 14, 7, 5};

        int i = num[0];
        int j = num[0];

        for (int n : num) {
            if (i < n) {
                j = i;
                i = n;

            } else if (j < n) {
                j = n;

            }

        }
        System.out.println(j + " is the second largest number in the array");
    }
}
