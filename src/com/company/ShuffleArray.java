package com.company;

import java.util.Random;

public class ShuffleArray {

    public static int[] shuffled(int[] x){
        Random random = new Random();
        for(int i = 0; i < x.length; i++){
            int randIndex = random.nextInt(x.length);
            int temp = x[randIndex];
            x[randIndex] = x[i];
            x[i] = temp;
        }
        return x;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] sh = shuffled(arr);
        for(int i: sh) { System.out.print(i + " "); }
    }
}
