package com.company.lab4

import org.junit.Test

class EquationTest extends GroovyTestCase {
    private Equation equation=new Equation();
    void setUp() {
        super.setUp()
    }

    void tearDown() {
    }
@Test
    void testMaxValueOfFunction() {
    assertEquals(-3.0,equation.maxValueOfFunction(0,1,1));
    }
@Test
    void testMinValueOfFunction() {
    assertEquals(-4.0, equation.minValueOfFunction(0, 1, 1));
}
    }
