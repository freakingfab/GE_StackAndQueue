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
}
