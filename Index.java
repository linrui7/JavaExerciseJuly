package com.Egithub7;
/*
   Author:linrui
   Date:2019/7/4
   Content:输入一个数n，然后输入n个不同的数，再输入一个x。输出这个x的下标。如果没有返回-1
*/

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int len=scanner.nextInt();
            int [] arr=new int[len];
            for(int i=0;i<arr.length;i++){
                arr[i]=scanner.nextInt();
            }
            int num=scanner.nextInt();
            System.out.println(indexof(arr,num));
        }
    }
    public static int indexof(int [] arr,int val){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val){
                return i;
            }
        }
        return -1;
    }
}
