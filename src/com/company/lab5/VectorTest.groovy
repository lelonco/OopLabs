package com.company.lab5

import org.junit.Before
import org.junit.Test

class VectorTest extends GroovyTestCase {
    Vector v1=new Vector(3,4);
    Vector v2=new Vector(4,3);
    @Test
    void testAdd() {
        assertEquals(7.0,v1.add(v2).getX());
        assertEquals(7.0,v1.add(v2).getY());
    }
    @Test
    void testSub() {
        assertEquals(-1.0,v1.sub(v2).getX());
        assertEquals(-1.0,v1.sub(v2).getY());
    }
    @Test
    void testGetLength() {
        assertEquals(5.0,v1.getLength());
    }
    @Test
    void testMultiplyByNum() {
        assertEquals(6.0,v1.multiplyByNum(2).getX());
        assertEquals(8.0,v1.multiplyByNum(2).getY());
    }
    @Test
    void testGetAngleWithOY() {
        assertEquals(90.0,v1.getAngleWithOX()+v1.getAngleWithOY());
    }
    @Test
    void testGetAngleWithOX() {
        assertEquals(90.0,v1.getAngleWithOX()+v1.getAngleWithOY());
    }
    @Test
    void testGetAngleBetweenVector() {
    assertEquals(16.260204708311967,v1.getAngleBetweenVector(v2));
    }
    @Test
    void testGetScalarProduct() {
        assertEquals(24.0,v1.getScalarProduct(v2));
    }
}
