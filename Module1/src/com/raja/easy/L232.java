package com.raja.easy;

import java.util.Stack;

public class L232 {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
       int peekVal= myQueue.peek(); // return 1
        System.out.println(peekVal);
       int popVal= myQueue.pop(); // return 1, queue is [2]
        System.out.println(popVal);
        myQueue.empty(); // return false
        System.out.println(myQueue.empty());

    }
}


class MyQueue {
Stack<Integer> input=new Stack<>();
Stack<Integer> output=new Stack<>();

    public MyQueue() {

    }

    public void push(int x) {
        input.add(x);
    }

    public int pop() {
        peek();
     return   output.pop();

    }

    public int peek() {
        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.push(input.pop());
            }
        }
        return   output.peek();
    }

    public boolean empty() {
        return   input.isEmpty() && output.empty();
    }
}

