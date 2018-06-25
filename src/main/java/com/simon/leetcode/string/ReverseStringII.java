package com.simon.leetcode.string;


/**
 * Input: s = "abcdefg", k = 2
 * Output: "bacdfeg"
 */
public class ReverseStringII {

    public static String solution(String s,int k){

        if(null == s || s.equals("") || k==0){
            return s;
        }

        //k大于等于s的长度，翻转整个字符串
        if(k >= s.length()){
            return new StringBuilder(s).reverse().toString();
        }else{
            String strA=s.substring(0,k);
            String strB=s.substring(k);

            StringBuilder sbA=new StringBuilder(strA);

            StringBuilder sbB=new StringBuilder();

            sbB.append(sbA.reverse().toString())
                    .append(strB);

            return sbB.toString(); 
        }


    }
}
