package com.test;
/*
   Author:linrui
   Date:2019/7/14
   Content:输入一串字符串，统计其中的A-Z各有多少个
*/

import java.util.HashMap;
import java.util.Scanner;

public class AtoZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = scanner.nextLine();
            print(str);
        }
    }

    public static void print(String str) {
        if(str.length()==0){
            return;
        }
        char[] chars=str.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<26;i++){
            map.put((char) ('A'+i),0);
        }

        for(int i=0;i<str.length();i++){
            if(map.containsKey(chars[i])){
                map.put(chars[i],map.get(chars[i])+1);
            }
        }
        for(int i=0;i<map.size();i++){
            char ch= (char) ('A'+i);
            System.out.println(ch+":"+map.get(ch));
        }
    }
}
