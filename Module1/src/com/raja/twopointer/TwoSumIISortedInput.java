package com.raja.twopointer;

import java.util.Arrays;

public class TwoSumIISortedInput {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15}; int target = 9;
        int start=0;
        int end=numbers.length-1;
        int[] res=new int[2];
        while(start<=end){
            if(numbers[start]+numbers[end] ==target){
                res[0]=start+1;
                res[1]=end+1;
                break;
               // return res;
            }else if(numbers[start]+numbers[end] > target){

                end--;

            }else if(numbers[start]+numbers[end] < target){

                start++;
            }

        }
        System.out.println(Arrays.toString(res));
       // return res;
    }
}
