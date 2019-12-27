package com.itisacat.algo.algorithm;

import java.util.Arrays;

//这一周股市价格为[2,6,1,4,8]，求哪一天买入哪一天卖出，可获得最大收益，最大收益为多少
public class SpanMaxMain {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{2, 6, 1, 4, 8};
        int buy = 0;
        int sale = 0;
        int profile = 0;
        for (int i = 0; i < arr.length; i++) {
            int buyPrice = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int temp = arr[j] - arr[i];
                if (temp > profile) {
                    profile = temp;
                    buy = i;
                    sale = j;
                }
            }
        }
        System.out.println(buy + "" + sale);
    }
}
