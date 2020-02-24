package com.company;/*
 *
 */

public class PreorderSerialization {
    private final static char[] preorderArray = ("9,3,4,#,#,1,#,#,2,#,6,#,#").toCharArray();
    static class TreeNode{
        int val;
        TreeNode left, right;
        TreeNode(int x){
            this.val = x;
            this.left = this.right = null;
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
    }
}
