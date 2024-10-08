package com.raja.twopointer;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        int outValue=maxArea(height);
        System.out.println("Output:: "+outValue);
    }

    public static int maxArea(int[] height) {
        if(height.length==0){
            return 0;
        }
          int maxArea=0;
          int left=0;
          int right=height.length-1;
          while(left<right){
              int currentArea=Math.min(height[left],height[right])*(right-left);
              maxArea=Math.max(currentArea,maxArea);
              if(height[left]<height[right]){
                  left++;
              }else{
                  right--;
              }
          }
          return maxArea;

    }
}
