package com.company;

/*
 * Given the root of a binary tree, find the maximum value V for which there exists different nodes A and B,
 * where V = |A.val - B.val| and A is an ancestor of B.
 * (A node A is an ancestor of B if either: any child of A is equal to B, or any child of A is an ancestor of B.)
 *
 *
 */


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaxDiffAncestorsNodes {
    static class TreeNode{
        int data;
        TreeNode left, right;
        TreeNode(int val){ this.data = val; this.left = this.right = null; }
    }

    private static int maximumDifferenceFinder(TreeNode root){
        int maxDiff = -1; // Set it to zero.
        if(root == null) return maxDiff;

        List<List<Integer>> bfsLists = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        // Make the BFS traversal of the list.
        while(!q.isEmpty()){
            List<Integer> c = new ArrayList<>();
            for(int j = q.size(); j > 0; j--) {
                TreeNode temp = q.poll();
                c.add(temp.data);
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }
            bfsLists.add(c);
        }


        System.out.println(bfsLists);
        return maxDiff;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        System.out.println(maximumDifferenceFinder(root));
    }
}
