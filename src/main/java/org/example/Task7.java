package org.example;

public class Task7 {
    //7.	Write a Java Program to print the first 10 numbers of Fibonacci series.
    //f = f(n-1) + f(n-2)
    public static void main(String[] args) {


        int f = 0;
        int a = 1;
        int b = 0;

        for (int i = 0; i <= 10; i++) {
            f = a + b;
            b = a;
            a = f;

            System.out.print(f + " ");
        }
    }
}