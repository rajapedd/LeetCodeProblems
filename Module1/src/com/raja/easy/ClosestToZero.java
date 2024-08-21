package com.raja.easy;

public class ClosestToZero {

    public static void main(String[] args) {
       // int[] nums={-4,-2,1,4,8};
        int[] nums={-100000,-100000};
        int output=findClosestNumber(nums);
        System.out.println("Output:: "+output);
    }

    public static int findClosestNumber(int[] nums) {
        int closestVal=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int curClose = Math.abs(nums[i]);
            if(curClose < closestVal){
                ans=nums[i];
                closestVal=curClose;
            }else if(curClose == closestVal){
                ans=Math.max(ans,nums[i]);
            }
        }
        return ans;

    }
}
