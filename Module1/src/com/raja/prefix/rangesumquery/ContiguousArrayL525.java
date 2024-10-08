package com.raja.prefix.rangesumquery;

import java.util.HashMap;
import java.util.Map;
//
public class ContiguousArrayL525 {

    public static void main(String[] args) {
       // int[] nums={1,0,0,1,0,1,1};
        int[] nums={0,1,0};
        int maxLength=findMaxLength(nums);
        System.out.println(maxLength);
    }

    public static int findMaxLength(int[] nums){
        if(nums.length==0){
            return 0;
        }
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int maxLen=0;
        int preSum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                preSum-=1;
            }else if(nums[i]==1){
                preSum+=1;
            }

            if(map.containsKey(preSum)){
                    int idx=map.get(preSum);
                    int currLen=i-idx;
                    maxLen=Math.max(currLen,maxLen);
            }


        }
        return  maxLen;


    }
}
