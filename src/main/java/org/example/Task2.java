package org.example;

public class Task2 {
    public static void main(String[] args) {

        //Create an array of integer values. After the array is created, calculate the sum of all
        // stored elements in that array.


        int[] num = {36, 35, 20, 39, 32, 31, 30};

        int sum = 0;

        for (int i : num) {
            sum += i;
        }

        System.out.println("Sum of all numbers" + sum);
    }
}
