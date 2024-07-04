package com.raja.medium;

public class BestStockBuyII {
    public static void main(String[] args) {
        int[] ar={7,1,5,3,6,4};
        int left=0,right=1;
       // int maxProfit=Integer.MIN_VALUE;
        int outVal=0;
     while(left<right && right<ar.length){

         if(ar[left] > ar[right]){
            left=right;
            right++;
         }else{
             int tempProfit= ar[right]-ar[left];
             //System.out.println("Temp Profit::"+tempProfit);
             //maxProfit=Math.max(tempProfit,maxProfit);
             //System.out.println("Max Profit::"+maxProfit);
             outVal=outVal+tempProfit;
             left++;
             right++;
         }
     }

        System.out.println("Final Output::"+outVal);


    }
}
