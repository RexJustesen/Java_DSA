package com.rex.algorithms;

public class Recursion {

    public static int factorial(int n) {
        if(n < 1) return 1;
        return n * factorial(n - 1);
    }

    public static int power(int base, int exponent) {
        if(exponent < 1) return 1; //base case
        return base * power(base, exponent - 1); // recursive case
    }
}
