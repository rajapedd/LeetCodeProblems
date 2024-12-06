package com.raja.knapsak;

import java.util.Arrays;

public class CoinChangeL322 {

    public static void main(String[] args) {
        int[] coins={1};
        int amount=2;
        coinChange(coins,amount);
    }

    private static int coinChange(int[] coins, int amount) {
        if(amount < 1){
            return 0;
        }
        if(coins.length ==0){
            return -1;
        }
        int[] remainingArray=new int[amount+1];
        int max=amount+1;
        Arrays.fill(remainingArray,max);
        System.out.println("Array::"+Arrays.toString(remainingArray));
        remainingArray[0]=0;
        for(int indexAmount=1;indexAmount<=amount;indexAmount++){
            System.out.println("Index Amount:: "+indexAmount);
            for(int coinIndex=0;coinIndex<coins.length;coinIndex++){
                System.out.println("Coin Value::"+coins[coinIndex]);
                if (coins[coinIndex] <= indexAmount){
                    remainingArray[indexAmount]=
                            Math.min(remainingArray[indexAmount],
                                    remainingArray[indexAmount-coins[coinIndex]]+1);
                    System.out.println("Array Inside::"+Arrays.toString(remainingArray));

                }

            }

        }
        System.out.println("Result::"+remainingArray[amount]);
        return remainingArray[amount];
    }

}
