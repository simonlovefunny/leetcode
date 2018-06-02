package com.simon.leetcode.string;


/**
 * Input: "Let's take LeetCode contest"
 *Output: "s'teL ekat edoCteeL tsetnoc"
 */
public class ReverseWordsInaStringIII {

    /**
     *将每个空格前的字符串取出并翻转，添加空格后拼凑到Stringbuilder
     */
    public static String reverseWords(String s) {

        StringBuilder sb=new StringBuilder();

        StringBuilder temp=new StringBuilder();

        for(int i=0;i<=s.length()-1;i++){
            if(s.charAt(i) == ' '){
               sb.append(temp.reverse().toString()+" ");
               temp=new StringBuilder();
               continue;
            }
            if(i == s.length()-1){
                sb.append(temp.append(s.charAt(i)).reverse().toString());
                continue;
            }
            temp.append(s.charAt(i));
        }

        return sb.toString();
    }


    public static String shortSoluction(String s){

        StringBuilder sb=new StringBuilder();

        String[] arr=s.split(" ");

        for(String str:arr){
            StringBuilder temp=new StringBuilder();
            sb.append(temp.append(str).reverse()).append(" ");
        }

        return sb.toString().trim();
    }


    public static void main(String[] args) {

        System.out.println(shortSoluction("Let's take LeetCode contest"));

    }
}
