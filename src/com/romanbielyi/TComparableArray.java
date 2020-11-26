package com.romanbielyi;

import java.util.Arrays;
import java.util.Collections;

public class TComparableArray<T extends Comparable<T>> {
    private final T[] arr;

    public TComparableArray(T[] arr) {
        this.arr = arr;
    }

    public T[] getArr() {
        return arr;
    }

    public T getHighest() {
        return Collections.max(Arrays.asList(arr.clone()));
    }

    public T getLowest() {
        return Collections.min(Arrays.asList(arr.clone()));
    }

}
