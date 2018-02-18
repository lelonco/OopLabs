package com.company.Cezar;

public class Cezar
{
    public static char [] arrayCh= new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X','Y','Z'};
    public static String encrypt(String s,int n)
    {
        char [] ch= s.toUpperCase().toCharArray();
        char[] preRes= new char[ch.length];

        char currentCh;
        int pos=0;
        boolean res=false;
        for(int i=0;i<s.length();i++)
        {
            currentCh=ch[i];
            for(int j=0; j<arrayCh.length;j++)
            {
                if(arrayCh[j]==currentCh)
                {
                    pos=j;
                    res=true;
                    break;
                }
            }
            if(res)
            {
                if ((pos + n) > arrayCh.length-1)
                {
                    pos = ((n + arrayCh.length) - arrayCh.length)-1;
                }
                else
                {
                    pos+=n;
                }
                preRes[i]=arrayCh[pos];
                res=false;
            }
            else
            {
                preRes[i]=ch[i];
            }
        }
        String result=String.valueOf(preRes);
        return result;
    }
    public static String decrypt(String s, int n)
    {
        char [] ch= s.toUpperCase().toCharArray();
        char[] preRes= new char[ch.length];

        char currentCh;
        int pos=0;
        boolean res=false;
        for(int i=0;i<s.length();i++)
        {
            currentCh=ch[i];
            for(int j=0; j<arrayCh.length;j++)
            {
                if(arrayCh[j]==currentCh)
                {
                    pos=j;
                    res=true;
                    break;
                }
            }
            if(res)
            {
                if ((pos - n) <0)
                {
                    pos = (arrayCh.length+(pos-n));
                }
                else
                {
                    pos-=n;
                }
                preRes[i]=arrayCh[pos];
                res=false;
            }
            else
            {
                preRes[i]=ch[i];
            }
        }
        String result=String.valueOf(preRes);
        return result;
    }

        public static void main(String[] args)
        {
            String s="AB,C Z";
            System.out.println(encrypt(s,3)+'\n'+ decrypt(encrypt(s,3),3));
        }
}
