package com.itisacat.algo.algorithm;

//剪枝-为0的节点
public class ClearZeroNode {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        TreeNode right = new TreeNode(0);
        TreeNode right1 = new TreeNode(1);
        TreeNode left1 = new TreeNode(0);
        TreeNode right2 = new TreeNode(1);
        TreeNode right3 = new TreeNode(0);
        right1.right = right2;
        left1.right = right3;
        right.left = left1;
        right.right = right1;
        root.right = right;
        root = containsOne(root) ? root : null;
    }

    private static boolean containsOne(TreeNode root) {
        if (root == null) {
            return false;
        }
        boolean leftContains = containsOne(root.left);
        boolean rightContains = containsOne(root.right);
        if (!leftContains) {
            root.left = null;
        }
        if (!rightContains) {
            root.right = null;
        }
        return root.val == 1 || leftContains || rightContains;
    }

}
