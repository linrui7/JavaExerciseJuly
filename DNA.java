package com.Fgithub7;
/*
   Author:linrui
   Date:2019/7/10
   Content:
    牛牛又从生物科研工作者那里获得一个任务,这次牛牛需要帮助科研工作者从DNA序列s中找出最短没有出现在DNA序列s中的DNA片段的长度。
    例如:s = AGGTCTA
    序列中包含了所有长度为1的('A','C','G','T')片段,但是长度为2的没有全部包含,例如序列中不包含"AA",所以输出2。

    输入描述:
    输入包括一个字符串s,字符串长度length(1 ≤ length ≤ 2000),其中只包含'A','C','G','T'这四种字符。

    输出描述:
    输出一个正整数,即最短没有出现在DNA序列s中的DNA片段的长度。
*/

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class DNA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = scanner.next();
            System.out.println(function(str));
        }
    }

    private static int function(String str) {
        for (int i = 1; i < str.length(); i++) {
            Set<String> stringSet = new TreeSet<>();
            //将所有无重复子序列放进去
            for (int j = 0; j < str.length() - 1; j++) {
                stringSet.add(str.substring(j, j + i));
            }
            //比较所有子字符串与set的长度
            if (stringSet.size() < Math.pow(4, i)) {
                return i;
            }
        }
        return 1;
    }
}
