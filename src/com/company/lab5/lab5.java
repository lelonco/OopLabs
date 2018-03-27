package com.company.lab5;

import java.util.ArrayList;
import java.util.List;

public class lab5 {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        for(int i=10; i>0;i--)
        {
            list.add(i);
        }
        System.out.println(list);
        RemoveLast removeLast=new RemoveLast();
        System.out.println(removeLast.removeLastEl(list));
        InvertList invertList=new InvertList();
        System.out.println(invertList.ivertList(list));
        SortList sortList=new SortList();
        System.out.println(sortList.sortList(list));
        GetLength length=new GetLength();
        System.out.println(length.size(list));
        Vector v1= new Vector();
        Vector v2= new Vector();
        v1.setCoordinatesVector(3,4);
        v2.setCoordinatesVector(4,3);
        System.out.println(v1.getAngleBetweenVector(v2));
    }
}
