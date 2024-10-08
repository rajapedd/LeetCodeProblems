package com.raja.prefix.rangesumquery;

import java.util.Arrays;
//L303
public class NumArray {
    int[] prefixSum;
    public NumArray(int[] nums){
        if(nums.length > 0){
            prefixSum=new int[nums.length];
            prefixSum[0]=nums[0];
            for(int i=1;i<nums.length;i++){
                prefixSum[i]=prefixSum[i-1]+nums[i];
                System.out.println("Prefix Value::"+Arrays.toString(prefixSum));
            }
        }
    }

    public int sumRange(int left, int right) {
        System.out.println(Arrays.toString(prefixSum));
        System.out.println("Left::"+left);
        System.out.println("Right::"+right);
        if(left>0) {
            System.out.println("Range Sum:: " + (prefixSum[right] - prefixSum[left - 1]));
            return prefixSum[right]-prefixSum[left-1];
        }else{
            System.out.println("Range Sum:: " + (prefixSum[right]));
            return prefixSum[right];
        }


    }

}
