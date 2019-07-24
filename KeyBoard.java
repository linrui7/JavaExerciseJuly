package com.Jgithub7;
/*
   Author:linrui
   Date:2019/7/24
   Content:
        Now given a string that you are supposed to type,
        and the string that
        you actually type out, please list those keys
        which are for sure worn out.
        有一些坏掉的键，找出他们，字母用大写表示

输入
7_This_is_a_test
_hs_s_a_es
输出
7TI
*/

import java.util.Scanner;

public class KeyBoard {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
            String str1=scanner.nextLine();
            String str2=scanner.nextLine();
            //有坏掉的键盘，全部转换成大写进行处理
            str1=str1.toUpperCase();
            str2=str2.toUpperCase();
            for(int i=0;i<str1.length();i++) {
                //将一中所有包含2的用空字符串代替
                str1=str1.replace(str2.charAt(i)+"","");
            }
            String res="";
            for(int i=0;i<str1.length();i++){
                //如果结果字符串已经包含相同的字母则不输出
               if(res.contains(str1.charAt(i)+"")){
                   continue;
               }else {
                   System.out.print(str1.charAt(i));
                   res+=str1.charAt(i);
               }
            }
            System.out.println();
        }
    }
}
