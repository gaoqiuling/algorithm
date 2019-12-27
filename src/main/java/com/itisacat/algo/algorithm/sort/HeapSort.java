package com.itisacat.algo.algorithm.sort;

//堆排序-大顶堆，非稳定排序
//步骤：1.完全二叉树，从最后一个节点找到最大值放置到根节点
//2.根节点与最后叶子节点替换
//3.重复1.2步骤
public class HeapSort {
    public static void main(String[] args) {
        int[] a = {20, 30, 90, 40, 70, 110, 60, 10, 100, 50, 80};
        for (int i = a.length - 1; i >= 0; i--) {
            heapSort(a, i);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static void heapSort(int[] a, int len) {
        for (int i = len / 2 - 1; i >= 0; i--) {
            heap(a, i, len);
        }
        swap(a, len);
    }

    private static void heap(int[] a, int cur, int len) {
        int left = cur * 2 + 1;
        int right = cur * 2 + 2;
        if (cur * 2 + 1 > len || cur * 2 + 2 > len) {
            return;
        }
        int max = a[left] > a[right] ? left : right;
        if (a[cur] < a[max]) {
            int temp = a[cur];
            a[cur] = a[max];
            a[max] = temp;
        }
    }

    private static void swap(int[] a, int cur) {
        int temp = a[0];
        a[0] = a[cur];
        a[cur] = temp;
    }
}
