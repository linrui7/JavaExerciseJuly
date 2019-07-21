package com.Hgithub7;
/*
   Author:linrui
   Date:2019/7/21
   Content:
   输入一个字符串，然后对每个字符进行奇校验，最后输出校验后的二进制数
   (如'3’，输出：10110011)。
   3的ASCll为51  0110011 这七位里有四个1所以是偶数在最高位补1
*/

import java.util.Scanner;

public class Jiaoyan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = scanner.nextLine();
            jiaoyan(str.toCharArray());
        }
    }

    private static void jiaoyan(char[] chars) {
        int[] res = new int[8];
        for (int i = 0; i < chars.length; i++) {
            int n=0x01;
            int j=7;
            int sum=0;
            while (j>0){
                //与00000001的结果与00000010的结果依次七次
                //循环结束 得到七个位数
                if((chars[i]&n)==0){
                    res[j]=0;
                }else {
                    //保存1的个数
                    res[j]=1;
                    sum++;
                }
                n=n<<1;
                j--;
            }
            if((sum&1)==0){
                res[0]=1;
            }
            //依次打印保存的七个数
            for(int k=0;k<res.length;k++){
                System.out.print(res[k]);
            }

            res[0]=0;
            System.out.println();

        }
    }
}
}
