package com.company.lab4;

import java.math.BigInteger;

public class lab4 {

    public static void main(String[] args) {
       FastPow fastPow=new FastPow();
        System.out.println("Fast pow iter 2^2="+fastPow.fastPowIter(2,2));
        System.out.println("Fast pow recursion 2^10="+fastPow.fastPowRecursion(2,10));
        Equation equation=new Equation();
        System.out.println("Ex3 maximum of function [-10;10] with step 0.1="+equation.maxValueOfFunction(-10,10,0.1)+
        "\nMinimum ="+equation.minValueOfFunction(-10,10,0.1));
        SolveEquation solveEquation=new SolveEquation();
        System.out.println("Ex2 Find solve of function [-10;10] with eps 0.1 ="+solveEquation.solve(-10,10,0.1));
        Factorial factorial=new Factorial();
        System.out.println("Ex1 Factorial of number 5="+factorial.fact(new BigInteger("5")));
       // System.out.println(fastPow.count);
    }
}
