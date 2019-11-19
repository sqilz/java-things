package main;

import java.util.HashMap;

public class HashSet<T> implements Set<T> {
    private HashMap<T, String> map;
    private final String DUMMY = "HASHSET";
    private T[] t;

    public HashSet() {
        this.map = new HashMap<>();
    }

    public HashSet(T[] t) {
        this.t = t;
        for (T element : t) {
            this.add(element);
        }
    }

    @Override
    public boolean add(T t) {
        // stop from adding a null or duplicate element
        if (t == null || map.containsKey(t)) {
            return false;
        }
        this.map.put(t, DUMMY);
        return true;
    }

    @Override
    public void clear() {
        this.map = new HashMap<>();
    }

    @Override
    public boolean remove(Object element) {
        return this.map.remove(element)==DUMMY;
    }

    @Override
    public int size() {
        return this.map.size();
    }

    @Override
    public String toString() {
        return "main.HashSet[" +
                map.keySet() +
                ']';
    }
}
