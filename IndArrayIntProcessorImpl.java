package com.company.lab7;

import java.io.*;
import java.util.Arrays;

public class IndArrayIntProcessorImpl implements ArrayIntProcess {
    @Override
    public double avg(int[] arr) {
        double sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        return sum/arr.length;
    }

    @Override
    public double avg(File file) throws IOException, ClassNotFoundException {

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
        int []arr= (int[]) ois.readObject();
        double sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        return sum/arr.length;
    }

    @Override
    public int[] aceptToArray(int[] arr, IntProc proc) {
        int [] tempArray=new int[arr.length];
        int j=0;
       for(int i=0;i<arr.length;i++)
        {
            if(proc.accept(arr[i]))
            {
                tempArray[j++]=arr[i];
            }
        }
        if(j>0)
        {
            int []resArray= Arrays.copyOf(tempArray,j);
          /*  System.arraycopy(tempArray,0,resArray,0,j);*/
            return resArray;
        }
        else
        {
            return null;
        }
    }

    @Override
    public File acceptToFile(File file, IntProc proc) throws IOException, ClassNotFoundException {
        int j=0;
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
        int []arr= (int[]) ois.readObject();
        int []tempArray=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(proc.accept(arr[i]))
            {
                tempArray[j++]=arr[i];
            }
        }
        if(j>0)
        {
           int[] resArray=Arrays.copyOf(tempArray,j);
           File resFile=new File("FileResult.txt");
           ObjectOutputStream outputInFile=new ObjectOutputStream(new FileOutputStream(resFile));
           outputInFile.writeObject(resArray);
           outputInFile.close();
           return resFile;
        }
        else
        {
            return null;
        }
    }
}
