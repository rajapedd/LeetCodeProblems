package com.raja.medium;

public class L55JumpGame {
    public static void main(String[] args) {
        //int[] nums={1,2,3};
       //int[] nums= {0,2,3};
        //int[] nums=  {2,3,1,1,4};
       // int[] nums={2,0};
        int[] nums={3,2,1,0,4};
       int n=nums.length;
       boolean jumped=false;
       int val=n-1;
        System.out.println("Length::"+nums.length);
        if(nums.length==1){
            System.out.println("TRUE");
        }

        if(nums[0]==nums.length){
            System.out.println("TRUE");
        }
        int lastPosition=nums.length-1;
        for( int i=nums.length-1;i>=0;i--){
            System.out.println(" Index::"+i);
            System.out.println(" Val::"+nums[i]);
            System.out.println("Inside last position Index::"+lastPosition);
                if(i+nums[i] >=lastPosition){
                    lastPosition=i;
                }
        }
        System.out.println("Last Index::"+lastPosition);
        System.out.println(lastPosition==0);

        System.out.println(jumped);


    }
}
