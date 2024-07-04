package com.raja.medium;

import java.util.Arrays;
import java.util.List;

public class ZigZag {
    public static void main(String[] args) {
        String s="PAYPALISHIRING";
        int numRows=3;
         String resultStr1=approachOne(s,numRows);
        System.out.println("First Approach ::"+resultStr1);
        String resultStr2=approachTwo(s,numRows);
        System.out.println("Second Approach ::"+resultStr2);

    }

    private static String approachTwo(String s, int numRows) {
        StringBuffer[] zigzag=new StringBuffer[numRows];
        for(int i=0;i<numRows;i++){
            zigzag[i]=new StringBuffer();
        }
        int d=1;
        boolean goingDown=true;
        int index=0;
        System.out.println("Approach2 Array::"+Arrays.deepToString(zigzag));
        for(int i=0;i<s.length();i++){
            zigzag[index].append(s.charAt(i));
                if(index==0) {
                     d=1;
                } else if(numRows-1== index){
                    d=-1;
                }
                index+=d;
        }

        StringBuffer conversion=new StringBuffer();
        for(StringBuffer row:zigzag){
            conversion.append(row);
        }

        System.out.println("Approach2::"+String.valueOf(conversion));
return  String.valueOf(conversion)    ;
    }

    private static String approachOne(String s, int numRows) {
        if(numRows==1 || numRows>=s.length()){
            return s;
        }
        int len=s.length();
        char[][] zigzag=new char[numRows][len];
        int row=0,col=0;
        boolean goingDown=true;
        for(int i=0;i<s.length();i++){
            zigzag[row][col]=s.charAt(i);
            if(goingDown){
                if(row==numRows-1){
                    goingDown=false;
                    row--;
                    col++;
                }else {
                    row++;
                }
            }else {
                if(row==0){
                    goingDown=true;
                    row++;
                }else{
                    row--;
                }
                col++;
            }

        }


        char[] conversion=s.toCharArray();
 int index=0;
        for(int row1=0;row1<zigzag.length;row1++){
            for(int col1=0;col1<zigzag[0].length;col1++){
                if(zigzag[row1][col1]!=0){
                    conversion[index]=zigzag[row1][col1];
                    index++;
                }

               // System.out.println(conversion[index]);
            }
        }
       return String.valueOf(conversion);

    }
}
