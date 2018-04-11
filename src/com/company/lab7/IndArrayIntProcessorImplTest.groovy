package com.company.lab7

import org.junit.Test

class IndArrayIntProcessorImplTest extends GroovyTestCase {
    ArrayIntProcess process= new IndArrayIntProcessorImpl();
    int [] arr=[1,2,-5,10]
    File arrFile= new File(System.getProperty("user.dir")+"/arrFile.txt");
    @Test
    void testAvgArray() {
        assertEquals(1.5,process.avg(arr));
    }
    @Test
    void testAvgFile() {
        assertEquals(1.5,process.avg(arrFile))
    }
    @Test
    void testAceptToArray() {
        assertEquals([1,2,10],process.aceptToArray(arr,{i-> i>0}))
        assertEquals([-5],process.aceptToArray(arr,{i-> i<-1}))
    }
    @Test
    void testAcceptToFile() {
        assertEquals((new File("FileResult.txt")),process.acceptToFile(arrFile,{i-> i>0}))

    }
}
