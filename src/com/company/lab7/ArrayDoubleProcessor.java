package com.company.lab7;

public interface ArrayDoubleProcessor {
    double max(double[] arr);
    double min (double []arr);
    double [] filter(double[]arr, DoublePredicate predicate);
    void sort(double []arr);
}
