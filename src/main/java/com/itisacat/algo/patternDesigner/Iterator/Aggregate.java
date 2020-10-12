package com.itisacat.algo.patternDesigner.Iterator;

public interface Aggregate {
    void add(Object o);

    void remove(Object o);

    Iterator getIterator();
}
