package com.romanbielyi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyComparableList<T extends Comparable<T>> {
    private final List<T> list;

    public MyComparableList() {
        this.list = new ArrayList<>();
    }

    public List<T> getList() {
        return list;
    }

    public void add(T value) {
        list.add(value);
    }

    public T smallest() {
        return Collections.min(list);
    }

    public T largest() {
        return Collections.max(list);
    }
}
