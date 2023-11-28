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

    /*
        @desc: pop the top element in stack
        @params: none
        @return: T
     */
    public T pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty, unable to pop");
            return null;
        }
        return stack.removeLast();
    }

    /*
        @desc: peek the top element in stack
        @params: none
        @return: T
     */
    public T peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty, unable to peek");
            return null;
        }
        return stack.getLast();
    }
}
