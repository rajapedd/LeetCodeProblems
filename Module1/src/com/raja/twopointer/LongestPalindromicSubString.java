package com.raja.twopointer;

public class LongestPalindromicSubString {
    public static void main(String[] args) {
        String str="aaebabad";
        String palindrome=longestPalindrome(str);
        System.out.println("Palindromic:: "+palindrome);
    }


   public static String longestPalindrome(String str) {

        if (str.length() <= 1)
            return str;

        String LPS = "";

        for (int i = 1; i < str.length(); i++) {

            // Consider odd length
            int low = i;
            int high = i;
            // Keep extending in both left and right directions till the
            // conditions for a palindrome are met
            while(str.charAt(low) == str.charAt(high)) {
                low--;
                high++;

                // Terminating condition if we reach the end/start of the string
                if (low == -1 || high == str.length())
                    break;
            }

            // Indexes low and high can be used to extract the substring
            String palindrome = str.substring(low+1, high);
            if (palindrome.length() > LPS.length()) {
                // Capture the longest palindrome found
                LPS = palindrome;
            }

            // Consider even length
            low = i - 1;
            high = i;
            while(str.charAt(low) == str.charAt(high)) {
                low--;
                high++;

                if (low == -1 || high == str.length())
                    break;
            }

            palindrome = str.substring(low+1, high);
            if (palindrome.length() > LPS.length()) {
                // Similarly, keep a track of the longest even length palindrome
                LPS = palindrome;
            }
        }

        return LPS;
    }
}


