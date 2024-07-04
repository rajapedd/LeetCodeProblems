package com.raja.easy;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s="(]";
        char[] chr=s.toCharArray();
        Stack<Character> st= new Stack<>();
        for(Character ch: chr){
            if(ch.equals('{')){
                st.push('}');
            }else if(ch.equals('(')){
                st.push(')');
            }else if (ch.equals('[')){
                st.push(']');
            }else if(st.isEmpty() || st.pop() !=ch){
                System.out.println("FALSE");
                break;
            }
        }
        System.out.println(st.isEmpty());
    }
}
