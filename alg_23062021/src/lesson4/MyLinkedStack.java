package lesson4;

public class MyLinkedStack<E>{
    private MyLinkedList<E> list = new MyLinkedList<>();

    public void isEmpty(){
        list.isEmpty();
    }

    public int size(){
        return  list.size();
    }

    public E peek(){
        return list.getLast();
    }
    public void push(E item){
        list.insertLast(item);
    }

    public E pop(){
        return list.removeLast();
    }

    public String toString(){
        return list.toString();
    }
}
