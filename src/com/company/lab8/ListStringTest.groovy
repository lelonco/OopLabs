package com.company.lab8

class ListStringTest extends GroovyTestCase {
    ListString listString=new ListString();
    List<String> strings=new ArrayList<>();
    void testFindPolindrom() {
        strings.add("abba");
        strings.add("abcba");
        strings.add("abdbva");
        List<String> rightResult=new ArrayList<>();
        rightResult.add("abba");
        rightResult.add("abcba")
        assertEquals(rightResult,listString.findPolindrom(strings))
    }
}
