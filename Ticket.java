package com.Ggithub7;
/*
   Author:linrui
   Date:2019/7/17
   Content:
输入描述:
输入候选人的人数，第二行输入候选人的名字，第三行输入投票人的人数，第四行输入投票。

输出描述:
每行输出候选人的名字和得票数量。

输入
4
A B C D
8
A B C D E F G H
输出
A : 1
B : 1
C : 1
D : 1
Invalid : 4
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
            int n=scanner.nextInt();
            HashMap<String,Integer> hashMap=new HashMap<>();
            for(int i=0;i<n;i++){
                hashMap.put(scanner.next(),0);
            }
            hashMap.put("Invalid",0);
            int piaoshu=scanner.nextInt();
            for(int i=0;i<piaoshu;i++){
                String s=scanner.next();
                if(hashMap.containsKey(s)){
                    hashMap.put(s,hashMap.get(s)+1);
                }else {
                    hashMap.put("Invalid",hashMap.get("Invalid")+1);
                }
            }
            for(String s:hashMap.keySet()){
                System.out.println(s+" : "+hashMap.get(s));
            }
        }
    }
}
