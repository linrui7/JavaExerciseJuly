package com.Jgithub7;
/*
   Author:linrui
   Date:2019/7/23
   Content:

有个小孩正在上楼梯，楼梯有n阶台阶，小孩一次可以上1阶、2阶、3阶。请实现一个方法，计算小孩有多少种上楼的方式。
为了防止溢出，请将结果Mod 1000000007
给定一个正整数int n，请返回一个数，代表上楼的方式数。保证n小于等于100000。
*/

import java.util.Scanner;

public class Stairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            funtion(n);
        }
    }

    private static void funtion(int n) {
        //前三阶台阶
        //1.一步
        //2.一一  二
        //3. 一一一  一二 二一 三
        long count = 0;
        long[] bushu = {1, 2, 4};
        if (n <= 0) {
            count = 0;
        } else if (n <= 3) {
            count = (int) bushu[n - 1];
        } else {
            for (int i = 4; i <= n; i++) {
                long tmp = (bushu[0] + bushu[1] + bushu[2]) % 1000000007;
                bushu[0] = bushu[1];
                bushu[1] = bushu[2];
                bushu[2] = tmp;
            }
        }
        count = (int) bushu[2];
    }
}
