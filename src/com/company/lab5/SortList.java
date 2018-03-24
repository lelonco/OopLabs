package com.company.lab5;

import java.util.List;

public class SortList {
    public List<Integer> sortList(List<Integer>inputList)
    {
        int temp;//for saving temporal value;
        for (int i = 1; i < inputList.size(); i++) {
            for (int j = i; j > 0 && inputList.get(j - 1) > inputList.get(j); j--) {
                temp = inputList.get(j - 1);
                inputList.set(j-1,inputList.get(j));
                inputList.set(j,temp);
            }
        }
        return inputList;
    }
}
