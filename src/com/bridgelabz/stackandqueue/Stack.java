package com.bridgelabz.stackandqueue;
import java.util.LinkedList;

/*
    desc: class for implmenting stack using linked list
 */
public class Stack<T> {
    private LinkedList<T> stack;

    /*
        @desc: constructor for the class
        @params: none
        @return: none
     */
    public Stack(){
        this.stack = new LinkedList<>();
    }

    /*
        @desc: adds an element in the stack
        @params: element
        @return: void
     */
    public void push(T data) {
        stack.add(data);
    }
}
