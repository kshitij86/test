package com.company;

import java.util.Collections;
import java.util.Random;
import java.util.Arrays;

//


public class GraphRepresentation {

    private static void printer(int[][] nums){
        for (int[] i: nums){
            for(int j: i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        Integer N = 3;
        int[][] gardens = new int[N][N];
        int[][] paths ={{1,2},{2,3},{3,1}};
        for(int[] i: gardens)
            Arrays.fill(i, 0);

        for(int i = 0 ; i < paths.length; i++) {
            // Set the corresponding nodes in graph, to indicate they are connected. (UNDIRECTED GRAPH).
            gardens[paths[i][0] - 1][paths[i][1] - 1] = -1;
            gardens[paths[i][1] - 1][paths[i][0] - 1] = -1;
        }
        printer(gardens);

    }
}
