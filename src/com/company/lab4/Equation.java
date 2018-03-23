package com.company.lab4;

public class Equation {
   public double maxValueOfFunction(double begin, double end,double step)
   {
       double max=(-2)*Math.pow(begin,3)+3*begin-4;
       double temp;
       for(double i=begin+step;i<=end;i+=step)
       {
           temp=(-2)*Math.pow(i,3)+3*i-4;
           if(temp>max)
           {
               max=temp;
           }
       }
       return max;
   }

   public double minValueOfFunction(double begin, double end,double step)
   {
       double min=(-2)*Math.pow(begin,3)+3*begin-4;
       double temp;
       for(double i=begin;i<=end;i+=step)
       {
           temp=(-2)*Math.pow(i,3)+3*i-4;
           if(temp<min)
           {
               min=temp;
           }
       }
       return min;
   }

}
