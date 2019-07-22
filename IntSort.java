package com.Hgithub7;
/*
   Author:linrui
   Date:2019/7/22
   Content:对N个长度最长可达到1000的数进行排序。
*/

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class IntSort {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
            int n=scanner.nextInt();
            BigInteger bigInteger[]=new BigInteger[n];
            for(int i=0;i<n;i++){
                bigInteger[i]=scanner.nextBigInteger();
            }
            Arrays.sort(bigInteger);
            for(BigInteger i:bigInteger){
                System.out.println(i);
            }

        }
    }
}
