package com.Ggithub7;
/*
   Author:linrui
   Date:2019/7/12
   Content:
小红想买些珠子做一串自己喜欢的珠串。卖珠子的摊主有很多串五颜六色的珠串，
但是不肯把任何一串拆散了卖。于是小红要你帮忙判断一
下，某串珠子里是否包含了全部自己想要的珠子？
如果是，那么告诉她有多少多余的珠子；如果不是，那么告诉她缺了多少珠子。

为方便起见，我们用[0-9]、[a-z]、[A-Z]范围内的字符来表示颜色。
例如，YrR8RrY是小红想做的珠串；那么ppRYYGrrYBR2258可以买，因为包含了
全部她想要的珠子，还多了8颗不需要的珠子；
ppRYYGrrYB225不能买，因为没有黑色珠子，并且少了一颗红色的珠子。
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Goods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String have = in.nextLine();
        String need = in.nextLine();
        //HashMap存贮商人拥有的珠子
        Map<Character, Integer> havemap = new HashMap<>();
        for (char c : have.toCharArray()) {
            if (havemap.containsKey(c)) {
                havemap.put(c, havemap.get(c) + 1);
            } else {
                havemap.put(c, 1);
            }
        }
        //HashMap存储用户想要的珠子
        Map<Character, Integer> needmap = new HashMap<>();
        for (char c : need.toCharArray()) {
            if (needmap.containsKey(c)) {
                needmap.put(c, needmap.get(c) + 1);
            } else {
                needmap.put(c, 1);
            }
        }
        //计算相差的
        boolean buy = true;
        int lack = 0;
        for (Map.Entry<Character, Integer> en : needmap.entrySet()) {
            char k = en.getKey();
            int v = en.getValue();
            //如果有的小于需要的，并且有的包含需要的
            if (havemap.get(k) < v && havemap.containsKey(k)) {
                buy = false;
                lack += v - havemap.get(k);
            }
            //如果一个都没有
            else if(!havemap.containsKey(k)){
                buy=false;
                lack+=v;
            }
        }
        if(buy){
            System.out.println("Yes"+(have.length()-need.length()));
        }else{
            System.out.println("No"+ lack);
        }
    }
}
