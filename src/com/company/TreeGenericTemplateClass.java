package com.company;

import java.util.*;

// Template tree.
public class TreeGenericTemplateClass {
    static class TreeNode{
        int val;
        TreeNode left, right;
        TreeNode(int x){
            this.val = x;
            this.left = this.right = null;
        }
    }

    public static String stackToString(Stack <Integer> fl){
        String newl = "";
        StringBuilder stringBuilder = new StringBuilder();
        while(!fl.isEmpty()) newl += (String.valueOf(fl.pop()) + "->");
        return newl;
    }
    /* WTF.
    public static void makePath(TreeNode root, Stack<String> stacker){
        if(root == null) return;

        stacker.push(String.valueOf(root.val) + "->");

        if(root.left != null) makePath(root.left, stacker);
        if(root.left == null && root.right == null) {
            System.out.println(Arrays.toString(stacker.toArray()));
        }
        if(root.right != null) makePath(root.right, stacker);
        stacker.pop();
    }
*/

    // Prints the last node in tree.
    // Best approach is using BFS.
    public static List<Integer> BFSTreeTraversal(TreeNode root){
        List<Integer> lastListUsingBFS = new ArrayList<>();

        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.add(root);

        if(root == null) return lastListUsingBFS;
        while(!treeNodeQueue.isEmpty()){
            for(int i = treeNodeQueue.size() ; i > 0 ; i-- ) {
                TreeNode temp = treeNodeQueue.poll();
                lastListUsingBFS.add(temp.val);
                if (temp.left != null) treeNodeQueue.add(temp.left);
                if (temp.right != null) treeNodeQueue.add(temp.right);
            }
        }
        return lastListUsingBFS;
    }

    // Preorder traversal.
    public static void treePreorderPrinter(TreeNode root){
        if(root == null) return;

        // Print current value.
        System.out.println(root.val + " ");

        // Now go to left subtree.
        treePreorderPrinter(root.left);

        // And to the right.
        treePreorderPrinter(root.right);
    }

    public static TreeNode BSTMaker(TreeNode root, Integer key){
        if(root == null) {
            root = new TreeNode(key);
            return root;
        }
        if(root.val > key){
            root.left = BSTMaker(root.left, key);
        }

        if(root.val < key){
            root.right = BSTMaker(root.right, key);
        }
        return root;
    }

    static TreeNode root = null;
    // Implicitly calls BSTMaker(), return
    public static void insert(int key){
        root = BSTMaker(root, key);
    }

    public static void main(String[] args) {

        /* Making a BST down below. */

        List<Integer> list = new ArrayList<>();
        list.add(1);list.add(3);list.add(2);
        Collections.sort(list);
        for(Integer i : list){
            insert(i);
        }

        treePreorderPrinter(root);

    }
}
