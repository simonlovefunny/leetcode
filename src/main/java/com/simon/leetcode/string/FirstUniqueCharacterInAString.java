package com.simon.leetcode.string;

/**
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 * s = "leetcode"
 *return 0.
 *
 *s = "loveleetcode",
 *return 2.
 */
public class FirstUniqueCharacterInAString {

    public static int soluction(String s){
        int freq[]=new int[26];

        for(int i=0;i<s.length();i++){
            freq[s.charAt(i) -'a']++;
        }

        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i) -'a'] == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {


        System.out.println(soluction("leetcode"));

        System.out.println(soluction("loveleetcode"));
    }
}
