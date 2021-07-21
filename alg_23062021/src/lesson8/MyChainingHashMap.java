package lesson8;

import java.util.LinkedList;

public class MyChainingHashMap<K, V> {
    private int capacity;
    private int size;
    private final int DEFAULT_CAPACITY = 16;
    private LinkedList<Node>[] st;

    private class Node{
        private K key;
        private V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public MyChainingHashMap(int capacity) {
        if (capacity <= 0){
            throw new IllegalArgumentException("Incorrect argument capacity");
        }
        this.capacity = capacity;
        st = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            st[i] = new LinkedList<>();

        }
    }
    public MyChainingHashMap(){
        this.capacity = DEFAULT_CAPACITY;
        st = new LinkedList[DEFAULT_CAPACITY];
        for (int i = 0; i < DEFAULT_CAPACITY; i++) {
            st[i] = new LinkedList<>();
        }
    }

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int hash(K key){
        return (key.hashCode() & 0x7fffffff) % capacity;
    }
    private void chekKeyNotNull(K key){
        if (key == null){
            throw new IllegalArgumentException("The key is null!");
        }
    }
    public void put(K key, V value){
        chekKeyNotNull(key);
        int i = hash(key);
        for (Node nd : st[i]) {
            if (key.equals(nd.key)){
                nd.value = value;
                return;
            }
        }
        st[i].addLast(new Node(key, value));
        size++;
    }
    public V get(K key) {
        chekKeyNotNull(key);
        int i = hash(key);
        for (Node node : st[i]) {
            if (key.equals(node.key)) {
                return node.value;
            }
        }
        return null;
    }
    public boolean contain(K key){
        return get(key) != null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < capacity; i++) {
            for (Node nd : st[i]) {
                sb.append(nd.key).append(" ");
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

}
