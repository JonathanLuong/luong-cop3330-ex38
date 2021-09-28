package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 38 Solution
 *  Copyright 2021 Jonathan Luong
 */

import java.util.Scanner;
import java.util.Random;

public class App {
    static int[] filterEvenNumbers(int[] oldArray) {
        int[] newArray = new int [(oldArray.length)/2];
        int j = 0;

        for(int i = 0; i < (oldArray.length); i++) {
            if(oldArray[i] % 2 == 0) {
                newArray[j] = oldArray[i];
                j++;
            }
        }

        return newArray;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // Creates reader

        System.out.printf("Enter a list of numbers, separated by spaces: ");
        String input = reader.nextLine();

        // removes spaces and gets length
        String[] parts = input.split(" ");
        int[] numArray = new int [parts.length];

        for(int i = 0; i < parts.length; i++) {
            numArray[i] = Integer.parseInt(parts[i]);
        }

        int[] evenArray = filterEvenNumbers(numArray);

        System.out.printf("The even numbers are");
        for(int i = 0; i < evenArray.length; i++) {
            System.out.printf(" %d", evenArray[i]);
        }

    }
}