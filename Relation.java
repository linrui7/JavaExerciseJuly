package com.Kgithub7;
/*
   Author:linrui
   Date:2019/7/29
   Content:根结点编号为1。求出a和b点的最近公共祖先的编号。
   思路：根结点编号为1。满二叉树的子节点与父节点的关系为为root = child / 2
   如果a ！= b，就让其中的较大数除以2， 如此循环直到a == b
*/

public class Relation {
    public int getLCA(int a,int b){
        while (a!=b){
            if(a>b){
                a=a/2;
            }else{
                b=b/2;
            }
        }
        return a;
    }
}
