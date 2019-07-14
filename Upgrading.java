package com.Ggithub7;
/*
   Author:linrui
   Date:2019/7/14
   Content:
   链接：https://www.nowcoder.com/questionTerminal/fe6c73cb899c4fe1bdd773f8d3b42c3d
来源：牛客网

小易经常沉迷于网络游戏.有一次,他在玩一个打怪升级的游戏,他的角色的初始能力值为 a.在接下来的一段时间内,
他将会依次遇见n个怪物,每个怪物的防御力为b1,b2,b3...bn. 如果遇到的怪物防御力bi小于等于小易的当前能力值c,那么他就能轻松打败怪物,并 且使得自己的能力值增加bi;
如果bi大于c,那他也能打败怪物,但他的能力值只能增加bi 与c的最大公约数.那么问题来了,在一系列的锻炼后,小易的最终能力值为多少?
*/

import java.util.Scanner;

public class Upgrading {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
            int num=scanner.nextInt();
            int ability=scanner.nextInt();
            int arr[]=new  int[num];
            for(int i=0;i<num;i++){
                arr[i]=scanner.nextInt();
            }
            for(int i=0;i<num;i++){
                if(ability<arr[i]){
                    ability+=gcd(ability,arr[i]);
                }else {
                    ability+=arr[i];
                }
            }
            System.out.println(ability);
        }
    }
    //辗转相除法 获取最大公约数
    public static int gcd(int ability,int monster){
        int tmp;
        while (monster>0){
            tmp=monster;
            monster=ability/monster;
            ability=tmp;
        }
        return ability;
    }
}
