package com.Ggithub7;
/*
   Author:linrui
   Date:2019/7/13
   Content:
实现一个函数，检查二叉树是否平衡，平衡的定义如下，
对于树中的任意一个结点，其两颗子树的高度差不超过1。
给定指向树根结点的指针TreeNode* root，请返回一个bool，代表这棵树是否平衡。

*/

import javax.swing.tree.TreeNode;

public class BalanceTree {
    public boolean isBalance(TreeNode root) {
        //空树情况下
        if (root == null) {
            return true;
        }
        int leftheight = hight(root.left);
        int rightheight = hight(root.right);
        //比较左右子树的高度差
        if(Math.abs(leftheight-rightheight)>1){
            return false;
        }
        return isBalance(root.right) && isBalance(root.right);

    }

    public static int hight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(hight(root.left), hight(root.right));
    }

    static class TreeNode {
        TreeNode left;
        TreeNode right;
    }
}
