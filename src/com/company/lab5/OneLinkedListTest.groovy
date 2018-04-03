package com.company.lab5

import org.junit.Test

class OneLinkedListTest extends GroovyTestCase {
    OneLinkedList oneLinkedList = new OneLinkedList(10)
    @Test
    void testRemoveLast() {
        oneLinkedList.removeLast();
        assertEquals(9,oneLinkedList.getSize())
    }

    @Test
    void testInvert() {
        List<Integer> list=new ArrayList<>();
        for(int i=9;i>=0;i--)
        {
            list.add(i);
        }
        String rightResult=list;
        oneLinkedList.invert()
        String result=oneLinkedList;
        assertEquals(rightResult,result)
    }

    @Test
    void testSort() {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            list.add(i);
        }
        String rightResult=list;
        oneLinkedList.sort()
        String result=oneLinkedList;
        assertEquals(rightResult,result)
    }

    @Test
    void testGetSize() {
        assertEquals(10, oneLinkedList.getSize())
    }
}


