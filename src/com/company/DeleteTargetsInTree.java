package com.company;

/*
    (I need practice. A lot of it.)

    SOLUTION :

    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root.left != null) root.left = removeLeafNodes(root.left, target);
        if (root.right != null) root.right = removeLeafNodes(root.right, target);
        return root.left == root.right && root.val == target ? null : root;
    }

 */


public class DeleteTargetsInTree {

    public static boolean targetValidity = false;
    // TreeNode class declaration.
    static class TreeNode{
        int val;
        TreeNode left, right;
        TreeNode(int x){
            this.val = x;
            this.left = this.right = null;
        }
    }

    // Search the whole tree for leaf-target value and return if it exists.
    public static void isTargetThere(TreeNode root, int target){
        if(root == null)
            return ;
        if(root.left == null && root.right == null && root.val == target)
            System.out.println(true);
        isTargetThere(root.left, target);
        isTargetThere(root.right, target);
        System.out.println(false);
    }

    public static void printTree(TreeNode root){
        if(root == null)
        {
            System.out.print("null ");
            return;
        }
        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }

    // Remove leaf-target values.
    public static TreeNode leafRemover(TreeNode root, int target){
        if(root == null) return null;
        if(root.left == null && root.right == null && root.val == target) return  null;
        root.left = leafRemover(root.left, target);
        root.right = leafRemover(root.right, target);
        return root;
    }

    public static void main(String[] args) {

        // Construct the tree.
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(4);

        // Perform operations and print the tree.
        printTree(root);
        System.out.println("\n");
        root = leafRemover(root, 2);
        printTree(root);
        System.out.println("\n");
        root = leafRemover(root, 2);
        printTree(root);
    }
}
