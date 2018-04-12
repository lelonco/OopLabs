package com.company.lab8;

import java.util.ArrayList;
import java.util.List;

public class ListString {
    List<String> findPolindrom(List<String> stringList)
    {
        List<String> resultList=new ArrayList<>();
        boolean isPolindrom=false;
        for(String currentStr :stringList)
        {
            char [] arrCh= currentStr.toCharArray();
            int mid=currentStr.length()/2;
            for(int i=0, j=currentStr.length()-1;i<mid&&j>mid;i++, j--)
            {
                if(arrCh[i]==arrCh[j])
                {
                    isPolindrom= true;
                }
                else
                {
                    isPolindrom=false;
                    break;
                }
            }
            if(isPolindrom)
            {
                resultList.add(currentStr);
            }
        }
        return resultList;
    }
}
