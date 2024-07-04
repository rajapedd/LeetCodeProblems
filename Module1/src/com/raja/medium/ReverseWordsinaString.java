package com.raja.medium;

import java.util.Arrays;
import java.util.stream.Stream;

public class ReverseWordsinaString {
    public static void main(String[] args) {
        String s="the sky is blue";
       // String s="  hello world  ";
        String[] str=s.split(" ");
        System.out.println(Arrays.toString(str));
        int start=0,end=str.length-1;
        StringBuilder sb=new StringBuilder();
        int spaceCount=0;
        while(start<=end){
            if(str[start] != "" && str[end]!=""){
                String temp=str[start];
                str[start]=str[end];
                str[end]=temp;
                start++;
                end--;
            }else{
                spaceCount++;
            }
        }
        System.out.println(Arrays.toString(str));
        for(int i=0;i<str.length;i++){
            if(!str[i].equals("")){
                System.out.println("string val::"+str[i]);
                sb.append(str[i]);
                System.out.println(i);
                System.out.println(str.length-spaceCount);
                if(i != str.length-spaceCount-1){
                    sb.append(" ");
                }


            }
        }
        System.out.println("Final String::"+sb.toString());

    }
}
