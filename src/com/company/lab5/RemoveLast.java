package com.company.lab5;

import java.util.ArrayList;
import java.util.List;

public class RemoveLast {
    public List<Integer> removeLastEl(List<Integer> inputList)
    {
        List<Integer> outputList=new ArrayList<>();
        for(int i=0;i<inputList.size()-1;i++)
        {
            outputList.add(inputList.get(i));
        }
        return outputList;
    }

}
