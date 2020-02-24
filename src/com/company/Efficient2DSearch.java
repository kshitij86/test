package com.company;

public class Efficient2DSearch {
    private static int binarySearch(int[] nums, int l, int target, int r){
        int mid = (l+r) / 2;

        if(l > r)
            return -1;

        if(nums[mid] == target)
            return 1;

        if(nums[mid] > target)
            return binarySearch(nums, 0, target, mid-1);

        if(nums[mid] < target)
            return binarySearch(nums, mid+1, target, r-1);

        return -1;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        for(int[] i : matrix) {
            System.out.println(binarySearch(i, 0, 5, i.length+1));
        }
    }
}


