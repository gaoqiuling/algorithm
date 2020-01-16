package com.itisacat.algo.algorithm.levelOrder;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by qiuqiu on 2019/12/29.
 */
//使用队列实现树的层次遍历
    //按箭方向查找二叉树
    //数的左视图
public class LevelOrder {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        TreeNode treeRoot = new TreeNode(arr[0]);
        TreeNode treeNode2 = new TreeNode(arr[1]);
        TreeNode treeNode3 = new TreeNode(arr[2]);
        TreeNode treeNode4 = new TreeNode(arr[3]);
        TreeNode treeNode5 = new TreeNode(arr[4]);
        TreeNode treeNode6 = new TreeNode(arr[5]);
        TreeNode treeNode7 = new TreeNode(arr[6]);
        treeRoot.left = treeNode2;
        treeRoot.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;

        List<List<Integer>> list = new LinkedList<>();
        LevelOrder main = new LevelOrder();
        list = main.levelOrder(treeRoot);
        System.out.println("层序遍历结果是:");
        for (int i = 0; i < list.size(); i++) {
            List<Integer> levelList = list.get(i);
            System.out.print("[");
            for (int j = 0; j < levelList.size(); j++) {
                if (j != levelList.size() - 1)
                    System.out.print(levelList.get(j) + ",");
                else System.out.print(levelList.get(j));


            }
            System.out.println("]");
        }
    }


    private List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> wrapList = new LinkedList<>();
        if (root == null) return wrapList;
        //1.先将树的根结点放入到队列中
        queue.offer(root);
        while (!queue.isEmpty()) {
            //2.计算每层的结点数目，也就是队列中的元素
            int levelnums = queue.size();
            List<Integer> subList = new LinkedList<>(); //存储每一层的结点的值val
            //3.遍历一层的所有结点，把此层的结点的值保存下来(这时也会把遍历的结点踢出去)，同时把下一层的结点放入队列
            for (int i = 0; i < levelnums; i++) {
                if (queue.peek().left != null) queue.offer(queue.peek().left);  //peek返回队列的头元素，但不删除
                if (queue.peek().right != null) queue.offer(queue.peek().right);
                subList.add(queue.poll().val);                          //poll()返回队列的头元素，并且删除该元素
            }
            //4.将每一层的结点的值加入到集合中
            wrapList.add(subList);
        }
        return wrapList;
    }
}

