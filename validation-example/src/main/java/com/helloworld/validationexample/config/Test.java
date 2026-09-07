package com.helloworld.validationexample.config;

public class Test {

    /**
     * Binary search implementation using Java 8
     * @param arr sorted array of integers
     * @param target value to search
     * @return index of target if found, otherwise -1
     */
    public static int binarySearch(int[] arr, int target) {
        return binarySearchHelper(arr, target, 0, arr.length - 1);
    }

    private static int binarySearchHelper(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        
        int mid = left + (right - left) / 2;
        
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearchHelper(arr, target, mid + 1, right);
        } else {
            return binarySearchHelper(arr, target, left, mid - 1);
        }
    }

    /**
     * Iterative binary search
     * @param arr sorted array of integers
     * @param target value to search
     * @return index of target if found, otherwise -1
     */
    public static int binarySearchIterative(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 7;
        
        System.out.println("Array: " + java.util.Arrays.toString(sortedArray));
        System.out.println("Target: " + target);
        System.out.println("Recursive Result: " + binarySearch(sortedArray, target));
        System.out.println("Iterative Result: " + binarySearchIterative(sortedArray, target));
    }
}
