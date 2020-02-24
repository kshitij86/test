package com.company;

import java.util.ArrayList;
import java.util.List;

public class AdjacentDuplicatesInString {

    private static List<Character> fl = new ArrayList<>();

    private static boolean noAdjacentDups(char[] A){
        for(int i = 0; i < A.length; i++){
            if((i+1 < A.length) && (A[i] == A[i+1])){
                return true;
            }
        }
        return false;
    }

    private static void removeAdjDups(char[] A){

    }
    public static void main(String[] args) {
        System.out.println(noAdjacentDups("aa".toCharArray()));
        removeAdjDups("abbaa".toCharArray());
    }
}
