package com.raja.slidingwindow;


//643. Maximum Average Subarray I
public class MaxAverageSubArrayI {
    public static void main(String[] args) {
       int[] nums={1,12,-5,-6,50,3};
       int k=4;
        findMaxAverage(nums,k);
    }

    public static double findMaxAverage(int[] nums, int k) {
        int maxSum=Integer.MIN_VALUE;
        int windowSum=0;
        int substractIndex=0;
        for(int i=0;i<nums.length;i++){
            windowSum+=nums[i];
            if(i>=k-1){
                maxSum=Math.max(maxSum,windowSum);
                windowSum-=nums[substractIndex];
                substractIndex++;
            }

        }
        System.out.println((maxSum));
       return (double)maxSum/k;
    }
}
