package com.raja.easy;

public class L3190DivisibleByThree {
    public static void main(String[] args) {
     //   int[] nums={ 1,2,3,4};
        int[] nums={3,6,9};
      int operationCount=0;
            for(int num:nums){
                System.out.println("Number::"+num);
                if(num%3==0){
                    //operationCount++;
                    System.out.println("Block 1");
                }else if((num+1)%3==0){
                    operationCount++;
                    System.out.println("Block 2");
                }else if((num-1)%3==0){
                    operationCount++;
                    System.out.println("Block 3");
                }
            }
        System.out.println(operationCount);
    }
}
