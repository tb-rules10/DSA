package com.company.study;
import java.util.*;
import java.util.stream.IntStream;

public class Queued {
    int front, rear, size;
    int arr[];
    Queued(int size){
        this.size = size;
        arr = new int[size];
        rear = -1;
        front = 0;
    }
    boolean isFull(){
        return rear == size-1;
    }
    boolean isEmpty(){
        return rear == -1;
    }
    void enqueue(int x){
        if(isFull()){
            System.out.println("Overflow");
            return;
        }
        arr[++rear] = x;
        System.out.printf("%d enqueued\n",x);
    }
    int dequeue(){
        if(isEmpty()){
            System.out.println("Underflow");
            return -999;
        }
        int var = arr[front];
        IntStream.range(0, rear).forEach(i -> arr[i] = arr[i + 1]);
        rear--;
        System.out.printf("%d dequeued\n",var);
        return var;
    }
    void front()
    {
        if (front == rear) {
            System.out.println("Queue is Empty\n");
            return;
        }
        System.out.printf("Front Element - %d\n", arr[front]);
    }
    public static void main(String[] args) {
        Queued ob = new Queued(5);
        ob.enqueue(4);
        ob.enqueue(5);
        ob.enqueue(6);
        ob.front();
        ob.dequeue();
        ob.front();
//        ob.push(7);
//        ob.push(8);
//        ob.push(9);
    }
}

