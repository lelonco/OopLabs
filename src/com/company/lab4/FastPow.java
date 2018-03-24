package com.company.lab4;
public class FastPow {
    public static int count=0;
    public int fastPowRecursion(int a,int n)
    {
        count++;
        if(n==0)
        {
            return 1;
        }
        if(n%2==1)
        {
            return  fastPowRecursion(a,n-1)*a;
        }
        else
        {
            int b=fastPowRecursion(a,n/2);
            return b*b ;
        }
    }
    public int fastPowIter(int a, int n) {
        int res = 1;
        while (n>0) {
            if (n % 2 == 1)
            {
                res *= a;
            }
            a *= a;
            n /= 2;

        }
        return res;
    }
}
