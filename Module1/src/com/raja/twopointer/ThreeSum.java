package com.raja.twopointer;

import java.util.*;

//15. 3Sum
//Given an integer array nums,
// return all the triplets [nums[i], nums[j], nums[k]]
// such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//
//Notice that the solution set must not contain duplicate triplets.
public class ThreeSum {

    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        threeSum(nums);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        if(nums.length<3 ){
            return new ArrayList<>();
        }
        Set<List<Integer>> result=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    result.add(Arrays.asList(nums[i] , nums[left],nums[right]));
                    left++;
                    right--;
                }else if(sum >0){
                    right--;
                }else if(sum < 0){
                    left++;
                }
            }
        }
        return new ArrayList<>(result);
    }
}
