package com.simon.leetcode.string;


/**
 * #415 Given two non-negative integers num1 and num2 represented as string,
 * return the sum of num1 and num2.
 *
 * The length of both num1 and num2 is < 5100.
 *Both num1 and num2 contains only digits 0-9.
 *Both num1 and num2 does not contain any leading zero.
 *You must not use any built-in BigInteger library or
 * convert the inputs to integer directly.
 *
 */
public class AddStrings {

    public static String addString(String num1,String num2){

        StringBuilder sb=new StringBuilder();

        //carry作为进位
        int carry=0;

        //倒序从最低位开始计算
        for(int i= num1.length() -1,j=num2.length()-1; i >=0 || j>=0 || carry ==1 ;i--,j--){

            //当两个数字位数不同时，较小的那个高位取0进行运算
            int x=i < 0? 0:num1.charAt(i) - '0';
            int y=j < 0? 0:num2.charAt(j) - '0';

            sb.append((x+y+carry)%10);
            carry=(x+y+carry) / 10;

        }

        //翻转得到结果
        return sb.reverse().toString();

    }

    public static void main(String[] args) {

        String num1="123456";

        String num2="43561223151";

        System.out.println(addString(num1,num2));
    }
}
