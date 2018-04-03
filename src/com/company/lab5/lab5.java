package com.company.lab5;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class lab5 {
    public static void main(String[] args) {
        System.out.println("OK");
        OneLinkedList oneLinkedList=new OneLinkedList(10);

        List<Integer> list= new ArrayList<>();
//        for(int i=10; i>0;i--)
//        {
//            oneLinkedList.addLast(i);
//        }
        System.out.println(oneLinkedList);
        oneLinkedList.invert();
        System.out.println(oneLinkedList);
        oneLinkedList.removeLast();
        System.out.println(oneLinkedList);
        oneLinkedList.sort();
        System.out.println(oneLinkedList);
       /* System.out.println(list);
        Vector v1= new Vector();
        Vector v2= new Vector();
        v1.setCoordinatesVector(3,4);
        v2.setCoordinatesVector(4,3);
        System.out.println(v1.getAngleBetweenVector(v2));*/
    }
}
