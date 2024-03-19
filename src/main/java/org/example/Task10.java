package org.example;

public class Task10 {
    public static void main(String[] args) {
        //	Write a program to print out duplicate elements from an Array of Strings?

        String[] words = {"Watermelon", "Toyota", "Java", "Asghar", "Homework", "Wife", "Toyota"};

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    System.out.println("Duplicate word present: " + words[i]);
                }
            }
        }
    }
}
