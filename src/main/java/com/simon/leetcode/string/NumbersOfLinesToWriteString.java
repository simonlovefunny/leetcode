package com.simon.leetcode.string;


import java.util.HashMap;
import java.util.Map;

/**
 * #806 Number of Lines To Write String
 * We are to write the letters of a given string S,
 * from left to right into lines.
 *
 * Each line has maximum width 100 units, and if writing a letter would cause the width of the line to exceed 100 units,
 * it is written on the next line.
 * We are given an array widths, an array where widths[0] is the width of 'a', widths[1] is the width of 'b', ..., and widths[25] is the width of 'z'.
 *
 * 给一个26个元素的数组，依次对应26个字母的长度，给一个纯字母的字符串，将其写入长度为100的一行，如果超出100，则换行写，给出总行数和最后一行的长度
 */
public class NumbersOfLinesToWriteString {

    /**
     * 思路：通过计算字符和'a'的差值获取在数组中的索引，当前行长度超过100时，行数+1,并且当前字符的长度给width
     */
    public static int[] solution(int[] widths,String s){
     int lines=1;
     int width=0;

     for(char c:s.toCharArray()){
        int w=widths[c -'a'];
        width+=w;
        if(width > 100){
            lines++;
            width=w;
        }
     }
     return new int[]{lines,width};
    }


    public static void main(String[] args) {

        int[] widths={4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};

        int[] result=solution(widths,"bbbcccdddaaa");

        System.out.println("lines:"+result[0]+",numbers:"+result[1]);



    }
}
