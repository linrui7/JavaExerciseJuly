package com.Egithub7;
/*
   Author:linrui
   Date:2019/7/4
   Content:

   IP地址转数字
   直接将ip分割然后左移

   数字转IP地址
   从左到右，每8位进行一下分割，得到4段8位的二进制数，
   把这些二进制数转换成整数然后加上"."
*/

import java.util.Scanner;

public class BintoOrd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str1 = scanner.next();
            String str2 = scanner.next();
            print(str1, str2);
        }
    }

    public static void print(String str1, String str2) {
        String[] strarr = str1.split("\\.");
        long[] numarr = new long[4];
        for (int i = 0; i < 4; i++) {
            numarr[i] = Long.parseLong(strarr[i]);
        }
        System.out.println((numarr[0] << 24) + (numarr[1] << 16) + (numarr[2] << 8) + numarr[3]);

        StringBuffer stringBuffer=new StringBuffer("");
        Long ipbin=Long.parseLong(str2);
        //将数右移24位追加到str中
        stringBuffer.append(String.valueOf(ipbin>>>24));
        stringBuffer.append(".");
        // 将高8位 置0，然后右移16位追加
        stringBuffer.append(String.valueOf((ipbin & 0x00FFFFFF) >>> 16));
        stringBuffer.append(".");
        // 将高16位 置0，然后右移8位追加
        stringBuffer.append(String.valueOf((ipbin & 0x0000FFFF) >>> 8));
        stringBuffer.append(".");
        // 将高24位 置0,剩余8位追加
        stringBuffer.append(String.valueOf((ipbin & 0x000000FF)));
        System.out.println(stringBuffer);
    }
}
