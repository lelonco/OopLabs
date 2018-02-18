package com.company.lab3;

import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.util.Arrays;
import java.util.Random;

public class lab3 {
    public static boolean isSorted(int[] arr) {
        boolean result = true;
        boolean firstTime = true;
        boolean isRise = false;
        for (int i = 1; i < arr.length; i++) {
            if (firstTime) {
                if (arr[i] > arr[i - 1]) {
                    isRise = true;
                    firstTime = false;
                } else {
                    firstTime = false;
                }
            }
            if (isRise) {
                if (arr[i] < arr[i - 1]) {
                    result = false;
                    return result;
                }
            } else {
                if (arr[i] > arr[i - 1]) {
                    result = false;
                    return result;
                }
            }
        }
        return result;
    }

    public static void insertionSort(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j - 1] > arr[j]; j--) {
                temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
            }
        }
    }

    public static int[] sort(int[] arr) {
        if (arr.length < 2) return arr;
        int m = arr.length / 2;
        int[] arr1 = Arrays.copyOfRange(arr, 0, m);
        int[] arr2 = Arrays.copyOfRange(arr, m, arr.length);
        return merge(sort(arr1), sort(arr2));
    }

    //слияние двух массивов в один отсортированный
    public static int[] merge(int[] arr1, int arr2[]) {
        int n = arr1.length + arr2.length;
        int[] arr = new int[n];
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < n; i++) {
            if (i1 == arr1.length) {
                arr[i] = arr2[i2++];
            } else if (i2 == arr2.length) {
                arr[i] = arr1[i1++];
            } else {
                if (arr1[i1] < arr2[i2]) {
                    arr[i] = arr1[i1++];
                } else {
                    arr[i] = arr2[i2++];
                }
            }
        }
        return arr;
    }
    public static int linerSearch(int []arr,int key)
    {
        int len=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
            else if(key<arr[i])
            {
                len++;
            }
        }
        return arr.length-len;
    }

    public static int find(int []array,double x) {
        int i = -1;
        if (array != null) {
            int low = 0, high = array.length, mid;
            while (low < high) {
                mid = (low + high)/2; // Можно заменить на: (low + high) >>> 1, чтоб не возникло переполнение целого
                if (x == array[mid]) {
                    i = mid;
                    break;
                } else {
                    if (x < array[mid]) {
                        high = mid;
                    } else {
                        low = mid + 1;
                    }
                }
            }
        }
        return i;
    }
    public static int[] zavd1(int []arr, int key)
    {
        int len = linerSearch(arr,key);
        if(len==-1)
        {
            len=arr.length;
        }
        int[]result=new int [len];
        int iResult=0;
     for(int i=0;i<result.length;i++)
     {
         if(arr[i]<key)
         {
             result[iResult++]=arr[i];
         }
     }
     return result;
    }
    public static int [][] zavd2(int [][]arr, int nRow)
    {
            return arr;
    }
    public static boolean zavd3(String s)
    {
        char [] arrCh= s.toCharArray();
        boolean result=false;
        int mid=s.length()/2;
        for(int i=0, j=s.length()-1;i<mid&&j>mid;i++, j--)
        {
            if(arrCh[i]==arrCh[j])
            {
                result= true;
            }
            else
            {
                result=false;
                break;
            }
        }
        return result;
    }

    public static int[][] pascalTriangle(int n) {
        int[][] a = new int[n][];
        for (int i = 0; i < a.length; ++i) {
            a[i] = new int[i + 1];
            a[i][0] = 1;
            a[i][i] = 1;
            for (int j = 1; j < i; ++j) {
                a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
            }
        }
        return a;
    }
    public static void pascalPrint(int [] [] a,int size)
    {
        int maxNum = a[size - 1][(size - 1) / 2];
        int maxNumWidth = Integer.toString(maxNum).length();

        for (int i = 0; i < size; i++) {
            int stringPad = ((size) - 1 - i)*(maxNumWidth + 1) / 2;
            if (stringPad > 0)
                System.out.print(String.format("%" + stringPad + "s", ""));
            for (int j = 0; j <= i; j++) {
                String paddedNum = Integer.toString(a[i][j]);
                int totalPad = maxNumWidth - paddedNum.length();
                int rPad = totalPad / 2;
                if (rPad > 0)
                    paddedNum = String.format("%s%" + rPad + "s", paddedNum, "");
                int lPad = totalPad - rPad;
                if (lPad > 0)
                    paddedNum = String.format("%" + lPad + "s%s", "", paddedNum);
                System.out.print(paddedNum);
                if (j < i)
                    System.out.print(" ");
                else
                    System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[6];
        int [] arr2=new int [arr.length];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(10) + 1;
        }
        int numb=2;
        String s="asdsa";
        System.out.println("Array: "+Arrays.toString(arr)+ " Is sotred?:"+isSorted(arr));
        arr2=Arrays.copyOf(sort(arr),arr2.length);
        System.out.println("Sorted array: "+Arrays.toString(arr2)+" Is sotred?:"+isSorted(arr2));
        System.out.println("Position of search number("+numb+"): "+find(arr2,numb));
        System.out.println("Zavd1 key=7 "+Arrays.toString(zavd1(arr2,7)));
        System.out.println("Zavd3"+zavd3(s));
        System.out.println("Pascal");
        int size=10;
        int[][] a = pascalTriangle(size);
        pascalPrint(a,size);
    }
}
