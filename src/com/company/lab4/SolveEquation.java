package com.company.lab4;

public class SolveEquation {
    public double function(double x)
    {
        return (-2)*Math.pow(x,3)+3*x-4;
    }
    public double defFunction(double x)
    {
        return (-6)*Math.pow(x,2)+3;
    }
    public double def2Function(double x)
    {
        return (-12)*x;
    }
    public double solve(double a, double b,  double eps)
    {
        double x0;
        double x1=0;
        if(function(a)*function(b)>0)
        {
            System.out.println("Erorr");
        }
        else {
            if (function(a) * def2Function(a) > 0) {
                x0 = a;
            } else {
                x0 = b;
            }

            x1 = x0 - (function(x0) / defFunction(x0));
            while (Math.abs(x1 - x0) < eps) {
                x0 = x1;
                x1 = x0 - (function(x0) / defFunction(x0));
            }
        }
        return x1;
    }


}
