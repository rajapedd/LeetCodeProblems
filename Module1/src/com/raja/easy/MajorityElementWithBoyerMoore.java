package com.raja.easy;

public class MajorityElementWithBoyerMoore {
    //Boyer-Moore Voting Algorithm
    public static void main(String[] args) {
        int[] nums={3,2,3,1,1,1,1};
        int count=0,candidate=-1;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                candidate=nums[i];
            }
            count+= (candidate==nums[i])? 1:-1;
        }
        System.out.println(candidate);
        System.out.println(count);
        count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==candidate){
                count++;
            }

            if(count>(nums.length/2)){
                System.out.println("Majority Element "+candidate);
                break;
            }
        }

    }
}
