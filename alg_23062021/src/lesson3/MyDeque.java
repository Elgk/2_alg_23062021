package lesson3;

import java.util.NoSuchElementException;

public class MyDeque <T>{
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int end;

    public MyDeque(int capacity) {
        if (capacity <= 0){
            throw new IllegalArgumentException(" Uncorrect argument capacity");
        }
        this.list = (T[]) new Object[capacity];
    }

    public MyDeque() {
        this.list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public boolean isFull() {
        return size == list.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    private int prevIndex(int index) {
        return (list.length + index - 1) % list.length;
    }

    public T peekLeft(){
        if (isEmpty()){
            throw new NoSuchElementException("The queue is empty");
        }
        return list[prevIndex(end)];
    }

    public T peekRight(){
        if (isEmpty()){
            throw new NoSuchElementException("The queue is empty");
        }
        return list[begin];
    }


    public void insertLeft(T item){
        if (isFull()) {
            throw new RuntimeException("the queue is full");
        }
        size++;
        list[end] = item;
        end = nextIndex(end);
    }

    public void insertRight(T item) {
        if (isFull()) {
            throw new RuntimeException("the queue is full");
        }
        size++;
        begin = prevIndex(begin);
        list[begin] = item;
    }

    public T removeRight() {
        T temp = peekRight();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return temp;
    }

    public T removeLeft(){
        T temp = peekLeft();
        size--;
        list[prevIndex(end)] = null;
        end = prevIndex(end);
        return temp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = begin; i != end; nextIndex(i)) {
            sb.append(list[i]).append(", ");
        }
        if (isEmpty()){
            sb.append("[]");
        }else {
            sb.insert(0,"[");
            sb.setLength(sb.length()-2);
            sb.append("]");
        }
        return sb.toString();
    }

}
