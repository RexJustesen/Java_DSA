package com.rex.algorithms;

public class BubbleSort {
    // Bubble sort = pairs of adjacent elements are compared, and the elements
    //               swapped if they are not in order

    //               Quadratic time complexity O(n^2)
    //               small data set = okay-ish
    //               large data set = bad

    public static void bubbleSort(int[] arr) {

        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
