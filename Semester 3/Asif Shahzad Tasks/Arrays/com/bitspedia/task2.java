package com.bitspedia;

import java.util.*;

public class task2 {
    public static void main(String[] args) {
        int[] faceRoll = new int[6];
        Random random = new Random();

        for (int i = 0; i < 1000000; i++) {
            switch (random.nextInt(6) + 1) {
                case 1:
                    faceRoll[0] = ++faceRoll[0];
                    break;
                case 2:
                    faceRoll[1] = ++faceRoll[1];
                    break;
                case 3:
                    faceRoll[2] = ++faceRoll[2];
                    break;
                case 4:
                    faceRoll[3] = ++faceRoll[3];
                    break;
                case 5:
                    faceRoll[4] = ++faceRoll[4];
                    break;
                case 6:
                    faceRoll[5] = ++faceRoll[5];
                    break;

                default:
                    System.err.println("Error value");
                    break;
            }
        }
        for (int i = 0; i < faceRoll.length; i++) {
            System.out.println(
                    (i + 1) + " Appeared " + faceRoll[i] + " times." + " Perdentage is " + (faceRoll[i] / 10000));
        }

    }
}
