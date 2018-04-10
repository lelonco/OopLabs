package com.company.lab7;

public class ArrayProcessorImpl  implements  ArrayDoubleProcessor{
    @Override
    public double max(double []arr)
    {
        double res=arr[0];
        for(int i=1; i<arr.length;i++)
        {
            if(arr[i]>res)
            {
                res=arr[i];
            }
        }
        return res;
    }
    @Override
    public double min(double []arr)
    {
        double res=arr[0];
        for(int i=1; i<arr.length;i++)
        {
            if(arr[i]<res)
            {
                res=arr[i];
            }
        }
        return res;
    }
    @Override
    public  double[] filter(double []arr, DoublePredicate predicate)
    {
        int j=0;
        double [] tempArr=new double[arr.length];
        for(int i=0;i<tempArr.length;i++)
        {
            if(predicate.accept(arr[i]))
            {
                tempArr[j++]=arr[i];
            }
        }
        if(j>0)
        {
            double []resArr=new double[j];
            System.arraycopy(tempArr,0,resArr,0,j);
            return resArr;
        }
        else
        {
            return null;
        }
    }
    @Override
    public void sort(double []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int k=i;
            for (int j=k+1;j<arr.length;j++)
            {
                if(arr[j]<arr[k])
                {
                    k=j;
                }
            }
            double temp=arr[k];
            arr[k]=arr[i];
            arr[i]=temp;
        }
    }

}
