package com.rex.algorithms;

public class LinearSearch {
    // Linear search = Iterate through a collection on element at a time

    //                 runtime complexity: O(n)

    //                 Disadvantages:
    //                 Slow for large data sets

    //                 Advantages:
    //                 Fast for searches of small to medium data sets
    //                 Does not need to be sorted
    //                 Useful for data structures that do not have random access (Linked List)

    public static int linearSearch(int[] array, int value) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
