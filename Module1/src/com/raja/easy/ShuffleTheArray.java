package com.raja.easy;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
       int[] nums = {2,5,1,3,4,7};
       int[] ar=new int[nums.length];
       int n=3;
        for(int i=0;i<n;i++){
  ar[2*i]=nums[i];
  ar[2*i+1]=nums[n+i];
        }
        System.out.println("Final::"+Arrays.toString(ar));

    }
}
