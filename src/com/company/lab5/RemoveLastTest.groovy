package com.company.lab5

import org.junit.Test

class RemoveLastTest extends GroovyTestCase {
    @Test
    void testRemoveLastEl() {
        RemoveLast removeLast= new RemoveLast();
        List<Integer> list= new ArrayList<>();
        for(int i=10; i>0;i--)
        {
            list.add(i);
        }
        assertEquals(null,removeLast.removeLastEl(list).get(list.size()));
    }
}
