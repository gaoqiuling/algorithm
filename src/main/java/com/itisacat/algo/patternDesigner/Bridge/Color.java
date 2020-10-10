package com.itisacat.algo.patternDesigner.Bridge;

//   1、桥接模式实现了抽象化与实现化的脱耦。他们两个互相独立，不会影响到对方。
//   2、对于两个独立变化的维度，使用桥接模式再适合不过了。
//   3、对于"具体的抽象类"所做的改变，是不会影响到客户。
public interface Color {
    void paint(String sharp);
}
