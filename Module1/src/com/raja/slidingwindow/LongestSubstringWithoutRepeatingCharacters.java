package com.raja.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
       // String s="abcabcbb";
        String s="pwwkew";
       int output= lengthOfLongestSubstring(s);
        System.out.println("Output:: "+output);
    }


    public static int lengthOfLongestSubstring(String s) {
            if(s==null || s.length()==0){
                return 0;
            }
            int n=s.length();
            char[] ch=s.toCharArray();
            int maxLength=0;
            int left=0;
            Set<Character> set=new HashSet<>();
            for(int right=0;right<ch.length;right++){
                while(set.contains(ch[right])){
                    set.remove(ch[left]);
                    left++;
                }
                set.add(ch[right]);
                //System.out.println(set);
               // maxLength=set.size();
               int currentLength=right-left+1;
                maxLength=Math.max(currentLength,maxLength);
            }
        return maxLength;
    }
}
