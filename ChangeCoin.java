package com.Jgithub7;
/*
   Author:linrui
   Date:2019/7/23
   Content:
十七个银西可(Sickle)兑一个加隆(Galleon)，二十九个纳特(Knut)兑一个西可,计算他应该被找的零钱

思路：将所有钱都转化为最小的单位。然后取余。
输入
10.16.27 14.1.28
输出
3.2.1
*/

import java.util.Scanner;

public class ChangeCoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //将输入中的数存放在字符串数组中
        String[] stra = scanner.next().split("\\.");
        String[] strb = scanner.next().split("\\.");
        //将String转换成long型
        long[] longa = {Long.parseLong(stra[0]), Long.parseLong(stra[1]), Long.parseLong(stra[2])};
        long[] longb = {Long.parseLong(strb[0]), Long.parseLong(strb[1]), Long.parseLong(strb[2])};
        //将所有的钱都转换为最小的币
        long aKunt = longa[0] * 17 * 29 + longa[1] * 29 + longa[0];
        long bKunt = longb[0] * 17 * 29 + longb[1] * 29 + longb[0];
        long chazhi = aKunt - bKunt;
        if (chazhi < 0) {
            System.out.print("-");
            chazhi = -chazhi;
        }
        //再将差值换算成各种币
        long a=chazhi/17*29;
        long b=chazhi%(17*29)/29;
        long c=chazhi%(17*29)%29;
        System.out.println(a+"."+b+"."+c);
    }
}
