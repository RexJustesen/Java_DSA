package com.rex.algorithms;

public class InsertionSort {
    // Insertion sort = after comparing elements to the left
    //                  shift elements to the right to make room to insert a value

    //                  Quadratic time O(n^2)
    //                  small data set = decent
    //                  big data set = bad

    //                  fewer steps than Bubble sort
    //                  Best case is O(n) compared to Selection Sort O(n^2)

    public static void insertionSort(int[] arr){

        for(int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
}
