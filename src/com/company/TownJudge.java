package com.company;

/*
 *
 * In a town, there are N people labelled from 1 to N.
 * There is a rumor that one of these people is secretly the town judge.
 * If the town judge exists, then:
 * The town judge trusts nobody.
 * Everybody (except for the town judge) trusts the town judge.
 * There is exactly one person that satisfies properties 1 and 2.
 * You are given trust, an array of pairs trust[i] = [a, b] representing that the person labelled a trusts the person labelled b.
 * If the town judge exists and can be identified, return the label of the town judge.  Otherwise, return -1.
 *
 * SILLY SIMPLE.
 */

import java.util.Arrays;

public class TownJudge {

    public static int findJudge(int N, int[][] trust){
        int[] ctr = new int[N+1];
        for(int[] t: trust){
            // If you trust someone.
            -- ctr[t[0]];
            // If someone trusts you.
            ++ ctr[t[1]];
        }
        for(int i = 1; i <= N; i++){
            // If everyone except the person himself (who is the town judge) trusts the town judge.
            if(ctr[i] == N-1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int N = 3;
        int[][] trust = {{1,2}, {2,3}, {3,1}};
        System.out.println(findJudge(N, trust));
    }
}
