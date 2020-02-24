package com.company;

import java.util.ArrayList;
import java.util.List;

public class AllUniqueBSTs {
    /**
     * @param
     */
    static class TreeNode{
        int value;
        TreeNode left = null;
        TreeNode right = null;
        TreeNode(){ }
        TreeNode(int x) { value = x ; }
    }

    public TreeNode leftTreeMaker(TreeNode root, int[] countArray){
        TreeNode tempLeft = new TreeNode();
        for(int i : countArray){
            if(i < root.value){
                tempLeft.value = i;
                root.left = tempLeft;
            }
        }
        return root;
    }

    public TreeNode rightTreeMaker(TreeNode root, int[] countArray){
        TreeNode tempRight = new TreeNode();
        for(int i : countArray){
            if(i > root.value){
                tempRight.value = i;
                root.right = tempRight;
            }
        }
        return root;
    }

    public List<TreeNode> uniqueBSTListMethod(int n){
        int[] array = new int[n];
        List<TreeNode> treeNodeList = new ArrayList<>();
        for(int i  = 0; i < n; i++) array[i] = i+1;
        TreeNode root = new TreeNode(array[0]);

        return treeNodeList;
    }

    public static void main(String[] args) {

    }
}
