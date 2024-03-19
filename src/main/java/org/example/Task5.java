package org.example;

public class Task5 {
    public static void main(String[] args) {
        //Write a program to swap 2 numbers without a temporary variable

        int i = 4;
        int j = 5;

        System.out.println("Before swap:");
        System.out.println("i= " + i + " j= " + j);

        i += j;
        j = i - j;
        i = i - j;
        System.out.println("After swap:");
        System.out.println("i= " + i + " j= " + j);
    }
}
