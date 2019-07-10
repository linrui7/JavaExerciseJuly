package com.Fgithub7;
/*
   Author:linrui
   Date:2019/7/10
   Content:读入N名学生的成绩，将获得某一给定分数的学生人数输出。
    测试输入包含若干测试用例，每个测试用例的格式为
    第1行：N
    第2行：N名学生的成绩，相邻两数字用一个空格间隔。
    第3行：给定分数
    当读到N=0时输入结束。其中N不超过1000，成绩分数为（包含）0到100之间的一个整数。
*/

import java.util.Scanner;

public class CountOFSame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n == 0) {
                return;
            }
            //保存输入的成绩
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }
            //目标分数
            int tmp=scanner.nextInt();
            int num=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==tmp){
                    num++;
                }
            }
            System.out.println(num);
        }
    }
}