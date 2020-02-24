package com.company;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {
        Random random = new Random();
        Integer guess = -1;  int actual = random.nextInt(10);
        Scanner scanner = new Scanner(System.in);
        while(guess != actual){
            System.out.print("Guess : ");
            guess = scanner.nextInt();
            if(guess < actual) System.out.println("HIGHER");
            else if(guess > actual) System.out.println("LOWER");
        }
        System.out.print("DONE");
    }
}
