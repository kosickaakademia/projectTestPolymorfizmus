package sk.kosickaakademia.onofrej.stack;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {
    private int capacity;
    private List<T> array;

    public Queue (int c){
        this.capacity=c;
        array=new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize(){
        return array.size();
    }

    public boolean isEmpty(){
        return array.isEmpty();
    }

    public boolean isFull(){
        return capacity==array.size();
    }

    public void enqueue(T value){
        if(isFull()){
            System.out.println("Queue is full");
        }
        else{
            array.add(value);
        }
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else
            array.remove(0);
    }

    public T front(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }
        else
            return array.get(0);

    }

    public void print(){
        System.out.println();
        for(T t:array)
            System.out.print(t+"  ");
    }

    public void clear(){
        array.clear();
    }

}
