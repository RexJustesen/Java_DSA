package com.rex.algorithms;

public class SelectionSort {
    // Selection sort = search through an array and keep track of the minimum value during
    //                  each iteration. At the end of each iteration, we swap variables

    //                  Quadratic time O(n^2)
    //                  small data set = okay
    //                  big data set = bad

    public static void selectionSort(int[] arr) {

        for(int i = 0; i < arr.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
