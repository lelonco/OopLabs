package com.company.lab4

import org.junit.After
import org.junit.AfterClass
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test

import static org.junit.Assert.*;

class FactorialTest extends groovy.util.GroovyTestCase {
    private Factorial factorial= new Factorial()

    @Test
    public void testFact01()
    {
        assertEquals(new BigInteger("1"),factorial.fact(new BigInteger("0")));
    }
    @Test
    public void testFact02()
    {
        assertEquals(new BigInteger("120"),factorial.fact(new BigInteger("5")));
    }

}
