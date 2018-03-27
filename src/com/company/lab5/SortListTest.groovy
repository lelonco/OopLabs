package com.company.lab5

import org.junit.Test

class SortListTest extends GroovyTestCase {
    @Test
    void testSortList() {
        SortList sortList=new SortList();
        List<Integer> list= new ArrayList<>();
        for(int i=10; i>0;i--)
        {
            list.add(i);
        }
        assertEquals(list.get(list.size()-1),sortList.sortList(list).get(0));
    }
}
