// 28. Find the Index of the First Occurrence in a String


// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 

// Example 1:

// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.
// Example 2:

// Input: haystack = "leetcode", needle = "leeto"
// Output: -1
// Explanation: "leeto" did not occur in "leetcode", so we return -1.
 



package String;

import java.util.*;

class FirstOccurence {
    public int strStr(String haystack, String needle) {
        //my method
        String text = haystack;
        String pattern = needle;

        if(pattern.length() == 0){
            return 0;
        }
     
        for(int i = 0; i <= text.length() - pattern.length(); i++){
            if(text.substring(i, i + pattern.length()).equals(pattern)){
                return i;
            }
           
        }
        return -1;

        //real method
        // return haystack.indexOf(needle);


    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String hs = sc.next();
        String ndl = sc.next();

        hs = hs.toLowerCase();
        ndl = ndl.toLowerCase();

        FirstOccurence sol = new FirstOccurence();
        int result = sol.strStr(hs, ndl);
        System.out.println(result);


        sc.close();
    }
}
