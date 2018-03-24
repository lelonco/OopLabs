package com.company.lab4

import org.junit.After
import org.junit.AfterClass
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test

class FastPowTest extends GroovyTestCase {
    private FastPow fastPow= new FastPow();
    @Test
    public void testFastPowREcursion01()
    {
        assertEquals(32,fastPow.fastPowRecursion(2,5));
    }
    @Test
    public void testFastPow02()
    {
        assertEquals(27,fastPow.fastPowRecursion(3,3));
    }
    @Test
    public void testFastPowIter01()
    {
        assertEquals(2048,fastPow.fastPowIter(2,11));
    }
    @Test
    public void testFastPowIter02()
    {
        assertEquals(27,fastPow.fastPowIter(3,3));
    }


}
