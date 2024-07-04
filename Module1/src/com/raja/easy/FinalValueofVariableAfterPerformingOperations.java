package com.raja.easy;

public class FinalValueofVariableAfterPerformingOperations {
    public static void main(String[] args) {
        String[] operations={"--X","X++","X++"};
        int X=0;
        for(String str:operations){
          System.out.println(str.toString());
          if(str.equals("--X")){
             --X;
          } else if (str.equals("++X")) {
              ++X;
          }else if (str.equals("X--")) {
              X--;
          }else if (str.equals("X++")) {
              X++;
          }
     }
        System.out.println(X);


    }
}

