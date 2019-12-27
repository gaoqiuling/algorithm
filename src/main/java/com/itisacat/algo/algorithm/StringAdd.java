package com.itisacat.algo.algorithm;

public class StringAdd {
    public static void main(String[] args) {
        StringBuffer result = new StringBuffer();
        String a = "1223467332";
        String b = "394405607777644";
        String str1 = new StringBuffer(a).reverse().toString();
        String str2 = new StringBuffer(b).reverse().toString();
        int len = Math.min(str1.length(), str2.length());

        int overflow = 0;
        for (int i = 0; i < len; i++) {
            int v = Integer.parseInt(str1.charAt(i) + "") + Integer.parseInt(str2.charAt(i) + "") + overflow;
            result.append(v % 10);
            overflow = v / 10;
        }
        if (str1.length() <= len) {
            str1 = str2;
        }
        for (int i = len; i < str1.length(); i++) {
            int v = Integer.parseInt(str1.charAt(i) + "") + overflow;
            result.append(v % 10);
            overflow = v / 10;
        }
        System.out.println(result.reverse().toString());
    }
}
