package com.rex;

import static com.rex.algorithms.Recursion.factorial;
import static com.rex.algorithms.LinearSearch.linearSearch;
import static com.rex.algorithms.Recursion.power;

public class Main {
    public static void main(String[] args) {

        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        int index = linearSearch(array, 10);

        if(index != -1){
            System.out.println("Element found at index: " + index);
        }else {
            System.out.println("Element not found");
        }

        System.out.println(factorial(7));
        System.out.println(power(2,8));
    }
}