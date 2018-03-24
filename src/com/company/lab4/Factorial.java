package com.company.lab4;

import java.math.BigInteger;

public class Factorial {
    public BigInteger fact(BigInteger numb)
    {
        if(numb.equals(BigInteger.ZERO))
        {
            return BigInteger.valueOf(1);
        }
        else
        {
            return numb.multiply(fact(numb.subtract(BigInteger.ONE)));
        }

    }
}

