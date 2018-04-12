package com.company.lab8;

import java.awt.*;
import java.util.HashMap;

public class CountChars {

   HashMap getCount(String srcString)
    {
        String patern="[a-z]";
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c: srcString.toLowerCase().toCharArray())
        {
            String temp=""+c;
            if(temp.matches(patern))
            {
                if(map.containsKey(c))
                {
                    map.put(c,map.get(c)+1);
                }
                else
                {
                    map.put(c,1);
                }
            }
        }
        return map;
    }
}
