package com.company.lab7

import org.junit.Test

class IndArrayIntProcessorImplTest extends GroovyTestCase {
    ArrayIntProcess process= new IndArrayIntProcessorImpl();
    int [] arr=[1,2,-5,10]

    if()
    @Test
    void testAvgArray() {
        assertEquals(1.5,process.avg(arr));
    }
    @Test
    void testAvgFile() {
    }
    @Test
    void testAceptToArray() {
        assertEquals([1,2,10],process.aceptToArray(arr,{i-> i>0}))
        assertEquals([-5],process.aceptToArray(arr,{i-> i<-1}))
    }
    @Test
    void testAcceptToFile() {
    }
}
