package com.Ggithub7;
/*
   Author:linrui
   Date:2019/7/13
   Content:
有两个用链表表示的整数，每个结点包含一个数位。这些数位是反向存放的，
也就是个位排在链表的首部。编写函数对这两个整数求和，并用链表形式返回结果。

给定两个链表ListNode* A，ListNode* B，请返回A+B的结果(ListNode*)。

测试样例：
{1,2,3},{3,2,1}
返回：{4,4,4}
*/

public class AddList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode addAB(ListNode a, ListNode b) {
        int numa = val(a);
        int numb = val(b);
        int sum = numa + numb;
        ListNode listNode = addlist(sum);
        return listNode;
    }

    //将两条链表中保存的节点转换成数
    public static int val(ListNode listNode) {
        StringBuffer stringBuffer = new StringBuffer();
        ListNode current = listNode;
        while (current != null) {
            stringBuffer.append(current.val);
            current = current.next;
        }
        return Integer.parseInt(stringBuffer.toString());
    }

    //将数装换成链表保存起来
    public static ListNode addlist(int num) {
        char[] chars = String.valueOf(num).toCharArray();
        //最后一位数是
        int lastval=Integer.parseInt(String.valueOf(chars[chars.length-1]));
        ListNode listNode=new ListNode(lastval);
        ListNode current=listNode;
        //将其他的位数依次保存
        for(int i=chars.length-2;i>=0;i--){
            //创建新节点为下一个位数
            ListNode nextnode=new ListNode(Integer.parseInt(String.valueOf(chars[i])));
            current.next=nextnode;
            current=nextnode;
        }
        return listNode;
    }
}
