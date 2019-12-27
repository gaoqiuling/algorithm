package com.itisacat.algo.algorithm;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;

//有十张扑克牌，从上面开始抽，抽出一张放桌子上，然后再抽出一张放扑克牌的最下面，这样循环往复的操作，直到手里的牌都没有了。
//这时，桌子上牌的顺序正好是1 2 3 4 5 6 7 8 9 10。
//要求写代码求出原顺序
public class PokerReverse {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        List<Integer> newList = Lists.newArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (newList.size() > 1) {
                Integer item = newList.get(newList.size() - 1);
                newList.remove(item);
                newList.add(0, item);
            }
            newList.add(0, list.get(i));
        }
        newList.forEach(System.out::println);
    }
}
