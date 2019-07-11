package com.Fgithub7;
/*
   Author:linrui
   Date:2019/7/11
   Content:

给定一个string数组p和它的大小n，同时给定string s，为母串，请返回一个bool数组，每个元素代表p中的对应字符串是否为s的子串。保证p中的串长度小于等于8，且p中的串的个数小于等于500，同时保证s的长度小于等于1000。

测试样例：
["a","b","c","d"],4,"abc"
返回：[true,true,true,false]
*/

import java.util.Scanner;

public class SonStr {
    public static boolean[] fun(String[] arr, int n, String str) {
        boolean[] boo=new boolean[arr.length];
        for(int i=0;i<n;i++){
            boo[i]=str.contains(arr[i]);
        }
        return boo;
    }
}
