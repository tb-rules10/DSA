package com.company.study;
import java.util.*;

public class LL {
    Node head;
    int size;
    LL(){
        size=0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    void addFirst(String data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next !=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    void printList(){
        if(head == null){
            System.out.println("EMPTY LIST!");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+" --> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }
    void deleteFirst(){
        if(head == null){
            System.out.println("EMPTY LIST!");
            return;
        }
        size --;
        head = head.next;
    }
    void deleteLast(){
        if(head == null){
            System.out.println("EMPTY LIST!");
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode.next != null){
            prevNode = prevNode.next;
            currNode = currNode.next;
        }
        prevNode.next = null;
    }
    void insertAfter(String data, Node prevNode){
        if(prevNode == null){
            System.out.println("Prev Node Cannot be Null!");
            return;
        }
        Node newNode = new Node(data);
        size++;
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }
    void reverse(){
        if(head == null){
            System.out.println("EMPTY LIST!");
            return;
        }
        Node prev = head;
        Node curr = head.next;
        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head.next = null;
        head = prev;
    }
    public static void main(String[] args) {
        LL ob = new LL();
        String commands = "Linked List  -  Enter 1 to exit";
        ob.addFirst("Hello");
        ob.addLast("Here!!");
        Node prevNode = ob.head;
        ob.insertAfter("TB",prevNode);
        ob.printList();
        ob.reverse();
        ob.printList();

    }
}
