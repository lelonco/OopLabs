package com.company.lab5;

public class OneLinkedNode {
    private int data;
    private OneLinkedNode next = null;

    public OneLinkedNode(int data, OneLinkedNode next) {
        this.data = data;
        this.next = next;
    }
    public OneLinkedNode(int data) { this.data = data; }
    public int getData() { return data; }
    public void setData(int data) { this.data = data; }
    public OneLinkedNode getNext() { return next; }
    public void setNext(OneLinkedNode next) { this.next = next;}
    public OneLinkedNode next() {
        return next != null ? next: null;
    }

}
