package com.itisacat.algo.algorithm;

//反转int类型数字
public class ReverseBit {
    public static void main(String[] args) {
        int input = 43261596;
        int result = 0;
        while (input != 0) {
            result = result * 10 + input % 10;
            input = input / 10;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            System.out.println(0);
        }
        System.out.println(result);
    }
}
