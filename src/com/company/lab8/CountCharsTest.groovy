package com.company.lab8

import org.junit.Test

class CountCharsTest extends GroovyTestCase {
    CountChars countChars=new CountChars()
    String str="AaBbCcDd"
    @Test
    void testGetCount() {
        HashMap<Character,Integer> rightMap=new HashMap<>()
        rightMap.put('a' as Character,2)
        rightMap.put('b' as Character,2)
        rightMap.put('c' as Character,2)
        rightMap.put('d' as Character,2)
        assertEquals(rightMap,countChars.getCount(str))
    }
}
