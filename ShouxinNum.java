package com.Hgithub7;
/*
   Author:linrui
   Date:2019/7/19
   Content:守形数是这样一种整数，它的平方的低位部分等于它本身。
   比如25的平方是625，低位部分是25，因此25是一个守形数。 编一个程序，判断N是否为守形数。
*/

import java.util.Scanner;

public class ShouxinNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            boshouxin(scanner.nextInt());
        }
    }

    public static void boshouxin(int num){
        int squ=num*num;
        String s1=String.valueOf(num);
        String s2=String.valueOf(squ);
        //截取原数字尾数
        String s=s2.substring(s2.length()-s1.length(),s2.length());
        if(s.equals(s1)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

}
