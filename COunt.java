package com.Jgithub7;
/*
   Author:linrui
   Date:2019/7/26
   Content:输入一行字符串，计算其中A-Z大写字母出现的次数

*/

import java.util.HashMap;
import java.util.Scanner;

public class COunt {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
            String line=scanner.nextLine();
            int count[] =new int[26];
            for(int i=0;i<count.length;i++){
                char ch=line.charAt(i);
                //将字母保存在数组中
                if(ch>='A'&&ch<='z'){
                    count[ch-'A']++;
                }
            }
            for(int i=0;i<26;i++){
                System.out.println(('A'+i)+":"+count[i]);
            }
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
