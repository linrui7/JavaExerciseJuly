package com.Jgithub7;
/*
   Author:linrui
   Date:2019/7/26
   Content:
   输入一个十六进制的数值字符串。
    输出该数值的十进制字符串。
*/

import java.util.Scanner;

public class ShiliuToShi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            String line=scanner.nextLine();
            long num=0;
            //取出十六进制中的数字
            for(int i=2;i<line.length();i++){
                num*=16;
                char ch=line.charAt(i);
                int n=0;
                if(ch>='A'&&ch<='F'){
                    n=ch-'A'+10;

                }else if(ch>='a'&&ch<='f'){
                    n=ch-'a'+10;
                }else {
                    n=ch-'0';
                }
                num=num+n;
            }
            System.out.println(num);
        }
    }

}
