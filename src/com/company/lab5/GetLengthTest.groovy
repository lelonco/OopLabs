package com.company.lab5

import org.junit.Test

class GetLengthTest extends GroovyTestCase {
   @Test
    void testSize() {
        GetLength getLength=new GetLength();
        List<Integer> list= new ArrayList<>();
        for(int i=10; i>0;i--)
        {
            list.add(i);
        }
        println list;
        assertEquals(10,getLength.size(list));
    }
}
