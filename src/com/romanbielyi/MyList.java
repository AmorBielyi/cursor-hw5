package com.romanbielyi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyList<T extends Number> {
    public final List<T> list;

    public MyList() {
        list = new ArrayList<>();
    }

    public List<T> getList() {
        return list;
    }

    public void add(T value) {
        list.add(value);
    }

    Comparator<T> myComparator = Comparator.comparingDouble(T::doubleValue);

    public T smallest() {
        return Collections.min(list, myComparator);

    }

    public T largest() {
        return Collections.max(list, myComparator);
    }

}
