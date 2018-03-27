package com.company.lab5

import org.junit.Test

class InvertListTest extends GroovyTestCase {
    @Test
    void testIvertList() {
        InvertList invertList=new InvertList()
        List<Integer> list= new ArrayList<>();
        for(int i=10; i>0;i--) {
            list.add(i);
        }
        assertEquals(list.get(list.size()-1),invertList.ivertList(list).get(0))
    }
}
