package com.company.lab4;

public class Factorial {
    public int fact(int numb)
    {
        if(numb<0)
        {
            throw new IllegalArgumentException();
        }
        if(numb>1)
        {
            return numb*fact(--numb);
        }
        else
        {
            return 1;
        }
    }
}

