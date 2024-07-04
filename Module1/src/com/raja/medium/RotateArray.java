package com.raja.medium;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5};
        int l=2;
        System.out.println(ar.length);
        int n=ar.length-1;
        int k=l % ar.length;
        System.out.println("Value K :: "+k);
        System.out.println("Original Array:: "+ Arrays.toString(ar));

        reverseNumbers(ar,0,n);
        System.out.println("Reversed Array:: "+ Arrays.toString(ar));
        reverseNumbers(ar,0,k-1);
        System.out.println("K Elements Reversed Array:: "+ Arrays.toString(ar));
        reverseNumbers(ar,k,n);
        System.out.println("Rotated Array:: "+ Arrays.toString(ar));
    }

    private static void reverseNumbers(int[] ar, int start, int end) {
        while(start<end){
            int temp=ar[start];
            ar[start]=ar[end];
            ar[end]=temp;
            start++;
            end--;
        }
    }
}
