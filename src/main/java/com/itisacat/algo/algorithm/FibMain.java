package com.itisacat.algo.algorithm;

public class FibMain {
    public static void main(String[] args) {
        int result = 0;
        int f1 = 0;
        int f2 = 1;
        System.out.println(f1);
        System.out.println(f2);
        do {
            result = f1 + f2;
            System.out.println(result);
            f1 = f2;
            f2 = result;
        } while (result <= 10000);
    }
}
