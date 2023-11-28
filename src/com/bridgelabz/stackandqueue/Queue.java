package com.bridgelabz.stackandqueue;
import java.util.LinkedList;

/*
    @desc: implements queue using linked list
 */
public class Queue<T> {
    private LinkedList<T> queue;

    /*
        @desc: constructor for the class
        @params: none
        @return: none
     */
    public Queue(){
        this.queue = new LinkedList<>();
    }

    /*
        @desc: adds an element in the queue
        @params: element
        @return: void
     */
    public void enqueue(T data) {
        queue.add(data);
    }

    /*
        @desc: dequeue the first element in queue
        @params: none
        @return: T
     */
    public T dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Stack is empty, unable to pop");
            return null;
        }
        return queue.removeFirst();
    }
}
