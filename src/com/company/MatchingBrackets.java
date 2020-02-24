package com.company;

// SCREW ME. CAN'T EVEN SOLVE SIMPLE LEETCODE ONES. CANNOT CONTINUE LIKE THIS.


import java.util.EmptyStackException;
import java.util.Stack;

public class MatchingBrackets {

    private static int bracketCount(char[] bracks){
        // Stack at the end will only contain single brackets.
        int l = 0; int r = 0;

        for(char curr: bracks){
            if(curr == '(') ++r;
            else if(r > 0) --r;
            else ++l;
        }
        return l+r;
    }

    public static void main(String[] args) {

        String b = "()))((";
        char[] bracks =  b.toCharArray();

        System.out.print(bracketCount(bracks));
    }
}
