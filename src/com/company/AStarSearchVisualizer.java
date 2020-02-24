package com.company;

import java.util.*;


// Make a A* Search for a matrix that has 1's as obstacles.
public class AStarSearchVisualizer {

    private static int[][] maze;

    private static void printMaze(int[][] maze){
        for (int[] i: maze){
            for(int j: i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int size = 10;
        maze = new int[size][size];

        // Fill the maze with zeroes, initially.
        for(int i = 0; i < maze.length; i++)
            Arrays.fill(maze[i], 0);

        //Randomly fill the maze with ones.
        Random random = new Random();
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                maze[(int) random.nextInt(size)][(int) random.nextInt(size)] = 1;
            }
        }

        printMaze(maze);

    }

}
