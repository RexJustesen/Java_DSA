package com.rex.algorithms;

public class BinarySearch {
    //Binary search = Search algorithm that finds the position
    //                of a target value within a sorted array.
    //                Half of the array is eliminated during each "step"

    //                Really good with large datasets
    //                Runtime Complexity O(log n)


    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            int value = array[mid];

            System.out.println("middle: " + value);
            if(value < target) {
                low = mid + 1;
            }else if(value > target) {
                high = mid - 1;
            }else {
                return mid; //target found
            }
        }

        return -1; //target not found
    }


}
