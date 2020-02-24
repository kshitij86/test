package com.company;

import java.util.Arrays;

public class WaitForWarmDay {

    static int ctr = 0;
    private static int wait(int[] n, int idx){
        return -1;
    }

    public static void main(String[] args) {
        int[] T = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] x = new int[T.length];
        Arrays.fill(x, 0);
        for(int i = 0; i < T.length; i++){
            x[i] = wait(T, i);
        }
        for(int v: x){
            System.out.print(v + " ");
        }
    }
}
