package com.Hgithub7;
/*
   Author:linrui
   Date:2019/7/20
   Content:

今年公司年会的奖品特别给力，但获奖的规矩却很奇葩：
1. 首先，所有人员都将一张写有自己名字的字条放入抽奖箱中；
2. 待所有字条加入完毕，每人从箱中取一个字条；
3. 如果抽到的字条上写的就是自己的名字，那么“恭喜你，中奖了！”
现在告诉你参加晚会的人数，请你计算有多少概率会出现无人获奖？

思路：抽奖是无放回的
分母是：第一个人的抽法*第二个人的抽法*...*n个人的抽法=n*...1=n！
错排算法

*/

import java.util.Scanner;

public class Award {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            float result = 100*(count(n) / pro(n));
            System.out.println(String.format("%.2f",result)+"%");
        }
    }

    //求分子，得到自己拿不到自己名字的次2数
    private static float count(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        } else {
            return (n - 1) * (count(n - 1) + count(n - 2));
        }
    }

    //求分母
    private static float pro(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * pro(n - 1);
        }
    }
}
