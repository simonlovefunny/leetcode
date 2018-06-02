package com.simon.leetcode.string;


/**
 * Example 1:
 *Input: A = 'abcde', B = 'cdeab'
 *Output: true
 *
 *Example 2:
 *Input: A = 'abcde', B = 'abced'
 *Output: false
 */
public class RotateString {

    //将字符串视为窗口，将A串复制的话，那么B串如果符合条件一定在A+A串中
    public static boolean rotateString(String A,String B){
        return A.length() == B.length() && (A + A).contains(B);
    }

    public static void main(String[] args) {

        String A = "abcde";
        String B = "cdeab";

//        String A = "abcde";
//        String B = "abced";

        System.out.println(rotateString(A,B));


    }
}
