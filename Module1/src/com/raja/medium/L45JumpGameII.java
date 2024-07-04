package com.raja.medium;

public class L45JumpGameII {
    public static void main(String[] args) {
      int[]  nums = {2,3,1,1,4};
      int finalPosition=nums.length-1;
        System.out.println("Final Position::"+nums[finalPosition]);
        for(int index=nums.length-2;index>=0;index--){
            if(index+nums[index] >= finalPosition){
                finalPosition=index;
            }
        }
        System.out.println(finalPosition==0);


    }
}
