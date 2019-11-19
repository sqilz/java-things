package main;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
class Node<K extends Comparable<K>, T> implements Comparable<Node<K,T>> {
    K key;
    T value;
    Node<K, T> left;
    Node<K, T> right;

    public Node(K key, T value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public int compareTo(Node<K, T> o) {
        return this.getKey().compareTo(o.getKey());
    }
}
