package com.bitspedia;

import java.util.*;

/**
 * task1
 */
public class task1 {

    public static void main(String[] args) {
        int num, sum = 0;
        int[] array1;
        double average = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        num = input.nextInt();

        array1 = new int[num];

        System.out.println("Enter data in array: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = input.nextInt();
            sum = sum + array1[i];

        }
        int min = array1[0];
        int minIndex = 0;

        int max = array1[0];
        int maxIndex = 0;

        for (int i = 0; i < array1.length; i++) {
            if (min > array1[i]) {
                min = array1[i];
                minIndex = i;
            }
            if (max < array1[i]) {
                max = array1[i];
                maxIndex = i;
            }
        }

        average = sum / array1.length;
        System.out.println("Minimum number is: " + min + " and its index is: " + minIndex);
        System.out.println("Maximum number is: " + max + " and its index is: " + maxIndex);
        System.out.println("Average is: " + average);
        input.close();

    }
}