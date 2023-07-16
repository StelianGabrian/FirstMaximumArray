package org.example;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];

        for(int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();//read the array`s values
        }
        int max = 0;
        for(int i = 0; i < arrayLength; i++) {
            if (array[i] > max) {
                max = array[i];//find maximum value in the array
            }
        }
        for (int i = 0; i < arrayLength;i++) {
            if(max == array[i]) {
                System.out.println(i); //print the array's index of the maximum value
                break;
            }
        }
    }
}
