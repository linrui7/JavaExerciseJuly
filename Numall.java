package com.Egithub7;
/*
   Author:linrui
   Date:2019/7/2
   Content:
   输入正整数N
   返回 N的各位之和以及 N*N的各位之和
*/

import java.util.Scanner;

public class Numall {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            int num=scanner.nextInt();
            outt(num);
        }
    }
    public static void outt(int num){
        int add1=0;
        int tmpnum=num;
        while(num!=0){
            add1+=num%10;
            num/=10;
        }
        int tmpadd1=add1;
        int add2=0;
        tmpnum*=tmpnum;
        while(tmpnum!=0){
            add2+=tmpnum%10;
            tmpnum/=10;
        }
        System.out.println(tmpadd1+" "+add2);
    }
}
