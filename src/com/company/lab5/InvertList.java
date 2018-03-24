package com.company.lab5;

import java.util.ArrayList;
import java.util.List;

public class InvertList {
    public List<Integer> ivertList(List<Integer>inputList)
    {
        List<Integer> outputList=new ArrayList<>();
        for (int i=inputList.size()-1;i>=0;i--)
        {
            outputList.add(inputList.get(i));
        }
        return outputList;
    }
}
