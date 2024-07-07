package com.raja.easy;

public class L1672RichestCustomerWealth {
    public static void main(String[] args) {
       int[][] accounts = {{1,2,3},{3,2,1}};
       int sum=0;
       for(int i=0;i<accounts.length;i++){
           int currentSum=0;
           for(int j=0;j<accounts[0].length;j++){
              currentSum+=accounts[i][j];
               sum=Math.max(currentSum,sum);
           }
       }
        System.out.println("Final Val::"+sum);
    }
}
