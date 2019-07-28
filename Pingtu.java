package com.Kgithub7;
/*
   Author:linrui
   Date:2019/7/28
   Content:
   一个木棒集合，每根木棒知道长度，问能否用这些木棒构成一个面积大于0的简单多边形 （不能自交）。
   数据有n次操作，每次操作要么增加一根长度为x的木棒，要么去掉一根长度为x的木棒，
   每次操作完后问剩下的木棒能否满足上述条件。

   思路：看成是三角形，先取出最大的一条边，然后再取出所有最小的看加起来的和与最大的相比
    输入
    5
    1 1
    1 1
    1 1
    2 1
    1 2
    输出
    No
    No
    Yes
    No
    No
*/

import javax.annotation.processing.Completion;
import javax.annotation.processing.Completions;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Pingtu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            boolean isStructure[] = new boolean[n];
            //保存每次输入的长度
            for (int i = 0; i < n; i++) {
                if (scanner.nextInt() == 1) {
                    list.add(scanner.nextInt());
                } else {
                    list.remove(scanner.nextInt());
                }
                //每添加或者删除一次都要判断是否是可以构成
                isStructure[i] = isStruct(list);
            }
            for (int i = 0; i < n; i++) {
                if (isStructure[i] == true) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }

    private static boolean isStruct(ArrayList<Integer> list) {
        //小于三条边不能构成
        if (list.size() < 3) {
            return false;
        }
        //进行排序，取出最大的一条边，看看其余边是否是大于最大的
        Collections.sort(list);
        int len = list.size();
        int sum = 0;
        for (int i = 0; i < len - 1; i++) {
            sum += list.get(i);
        }
        //如果其余边小于最大的边
        return (sum <= list.get(len - 1))? false:true;
    }
}
