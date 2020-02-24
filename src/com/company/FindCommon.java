package com.company;

import java.util.*;

/*
 * Given an array A of strings made only from lowercase letters, return a list of all characters that
 * show up in all strings within the list (including duplicates).
 * For example, if a character occurs 3 times in all strings but not 4 times, you need to include
 * that character three times in the final answer.
 */


public class FindCommon {

    public static List<String> commonCharacters(String[] A){
        List<String> res = new ArrayList<>();
        for(char c = 'a'; c <= 'z'; c++){
            int minCount = Integer.MAX_VALUE;
            // Loop through the strings.
            for(String str : A){
                int words = 0;
                for(char x: str.toCharArray()){
                    if(x == c) words++;
                }
                minCount = Math.min(minCount, words);
            }
            for(int i = 0 ; i < minCount ; i++) res.add("" + c);
        }
        return res;
    }
    public static void main(String[] args) {
            String[] A = {"bella","label","roller"};
            System.out.println(commonCharacters(A));
        }
}
