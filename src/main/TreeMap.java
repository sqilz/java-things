package main;

public class TreeMap<K extends Comparable<K>, T> {
    Node<K, T> root;

    boolean put(K key, T value) {
        if (this.root == null) {
            this.root = Node.<K, T>builder()
                    .key(key)
                    .value(value)
                    .left(null)
                    .right(null)
                    .build();
            return true;
        }



        return false;
    }

}
