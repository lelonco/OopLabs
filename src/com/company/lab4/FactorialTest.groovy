package com.company.lab4

import org.junit.After
import org.junit.AfterClass
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test

import static org.junit.Assert.*;

class FactorialTest extends groovy.util.GroovyTestCase {
    private Factorial factorialc
    @BeforeClass
    public static void setUpClass()
    {
    }
    @AfterClass
    public static void tearDownClass()
    {
    }
    @Before
    public void init()
    {
        factorialc=new Factorial();
    }
    @After
    public  void after()
    {
        factorialc=null;
    }
    @Test
    public void testFact01()
    {
        assertEquals(1,factorialc.fact(0));
    }
    @Test
    public void testFact02()
    {
        assertEquals(120,factorialc.fact(5));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testFact03()
    {
        factorialc.fact(-1);
    }






}
