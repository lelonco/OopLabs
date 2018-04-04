package com.company.lab5;

import java.util.ArrayList;
import java.util.List;

public class OneLinkedList {
    private OneLinkedNode root = null;
    OneLinkedList(int n)
    {
        for(int i=0;i<n;i++)
        {
            addLast(i);
        }
    }

    public void addFirst(int data) {
        if (root == null) {
            root = new OneLinkedNode(data);
        } else {
            root = new OneLinkedNode(data, root);
        }
    }
    public void addLast(int data) {
        if (root == null) {
            addFirst(data);
        } else {
            OneLinkedNode node = root;
            while (node.next() != null) {
                node = node.next();
            }
            node.setNext(new OneLinkedNode(data));
        }
    }
    public void removeFirst() {
        if (root != null) {
            OneLinkedNode node = root.next();
            root.setNext(null);
            root = node;
        }
    }
    public OneLinkedNode find(int data) {
        OneLinkedNode node = root;
        while (node != null && node.getData() != data) {
            node = node.next();
        }
        return node;
    }
    public int getLast()
    {
        OneLinkedNode node = root;
        while (node.next() != null) {
            node = node.next();
        }
        return node.getData();
    }
    public int getSize() {
        int count = 0;
        OneLinkedNode node = root;
        while (node!= null) {
            node = node.next();
            count++;
        }
        return count;
    }
    public void removeLast()
    {
        OneLinkedNode node=root;
        while(node.getNext().getNext()!=null)
        {
            node = node.next();
        }
        node.setNext(null);
    }
    public void invert() {
        List<Integer> list = new ArrayList<>();
        OneLinkedNode node = root;
        int size=getSize()/2;
        int count=0;
        while (size>count) {
            addFirst(getLast());
            removeLast();
            count++;
        }
    }
    public void sort() {
        boolean isSorted;
        int temp = 0;
        int count=0;
        int size=getSize();
        while (true) {
            count=0;
            isSorted = true;
            OneLinkedNode node = root;
            while (size-1>count) {
                if (node.getData() > node.getNext().getData()) {
                    temp = node.getData();
                    node.setData(node.next().getData());
                    node.next().setData(temp);
                    node=node.next();
                    isSorted = false;
                }
                else
                {
                    node = node.next();
                }
                count++;
            }
            if (isSorted) {
                break;
            }
        }
    }

    @Override
    public String toString() {
        OneLinkedNode node = root;
        List<Integer> list=new ArrayList<>();
        while (node!=null)
        {
            list.add(node.getData());
            node=node.getNext();
        }
        return list.toString();
    }


}
