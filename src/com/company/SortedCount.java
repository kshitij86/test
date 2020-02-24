package com.company;

import java.util.*;

// Return the count of a target element in a sorted array, in log(n) time.
// Binary search is the logical approach.
// Dosen't use extra space, but still somewhat iterative (searches for target 'while' it exists).
public class SortedCount {
    // Never compare 'int' with 'Integer', causes StackOverflowError.
    private static int countOfTarget = 0;
    public static boolean targetRemover(List<Integer> fl, int l, Integer target, int r){
        int mid = (l+(r-1)) / 2;
        if(fl.get(mid) == target) {++countOfTarget;  fl.remove(mid); return true; }
        if(fl.get(mid) < target)  return targetRemover(fl, mid+1, target, r);
        if(fl.get(mid) > target) return targetRemover(fl, l, target, mid-1);
        return false;
    }

    public static void main(String[] args) {
        Integer[] temp = {1,2,3,4,5,6,7,7,7,7,8};
        List<Integer> ds = new ArrayList<>(Arrays.asList(temp));
        int target = 7;
        // This part bothers, not really purely log(n).
        while(ds.contains(target)) { targetRemover(ds, 0, target, ds.size()); }
        System.out.println(target + " appears " + countOfTarget + " times");
    }
}
