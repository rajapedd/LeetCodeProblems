package com.raja.prefix.rangesumquery;

//560. Subarray Sum Equals K
//
//Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
//
//A subarray is a contiguous non-empty sequence of elements within an array.
//Example 2:
//
//Input: nums = [1,2,3], k = 3
//Output: 2

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] nums = {1,-1,0};
        int k = 0;
        int output= findSubArraySum(nums,k);
        System.out.println("Output:: "+output);
    }

    private static int findSubArraySum(int[] nums, int k) {
        int subArrayCount=0;
        int sum=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++) {
            sum += nums[i];
            int required=sum-k;
            subArrayCount += map.getOrDefault(required, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);

        }
        return subArrayCount;
    }
}
