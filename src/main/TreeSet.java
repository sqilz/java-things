package main;

import java.util.Comparator;

public class TreeSet<T> implements Set<T>, Comparator<T> {

    public TreeSet() {

    }

    @Override
    public boolean add(T t) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean remove(Object element) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int compare(T o1, T o2) {
        return 0;
    }
}
