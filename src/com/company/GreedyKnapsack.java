/*
*
*
*
* */

package com.company;

import java.util.*;

public class GreedyKnapsack {
    private static void printer(float[] x){
        for(float i : x) System.out.print(i + " ");
        System.out.println();
    }

    // Capacity in kgs.
    private static void makeSack(int[] prof, int[] weight, int capacity) {
        int size = prof.length;
        float[] profByWeight = new float[size];
        for (int i = 0; i < size; i++) {
            profByWeight[i] = ((float) prof[i] / weight[i]);
        }

        // Greedily select the maximum, until the sack is full.

        printer(profByWeight);
    }

    public static void main(String[] args) {
        int[] profits = {10, 5, 15, 7, 6, 18, 3};
        int[] weights = {2, 3, 5, 7, 1, 4, 1};
        makeSack(profits, weights, 15);
    }
}
