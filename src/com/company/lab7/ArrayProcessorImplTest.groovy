package com.company.lab7

import org.junit.Test

class ArrayProcessorImplTest extends GroovyTestCase {
    ArrayDoubleProcessor processor=new ArrayProcessorImpl()
    double  [] arr=[ 1.11, 2.11, 3.11, -1.11, -5.22, 11.10]
    @Test
    void testMax() {
        assertEquals(11.10,processor.max(arr))
    }
    @Test
    void testMin() {
        assertEquals(-5.22,processor.min(arr))
    }
    @Test
    void testFilter() {
        double []res=[11.10]
        assertEquals(res,processor.filter(arr,{i -> i>10}))
        double []res2=[-1.11,-5.22];
        assertEquals(res2,processor.filter(arr,{i->i<0}))
        assertEquals(null,processor.filter(arr,{i->i<(-10)}))
    }
    @Test
    void testSort() {
        double []rightRes =[-5.22, -1.11, 1.11, 2.11, 3.11, 11.1];
        processor.sort(arr)
        assertEquals(rightRes,arr)
    }
}
