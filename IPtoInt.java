package com.Ggithub7;
/*
   Author:linrui
   Date:2019/7/18
   Content:
原理：ip地址的每段可以看成是一个0-255的整数，把每段拆分成一个二进制形式组合起来，然后把这个二进制数转变成
一个长整数。
举例：一个ip地址为10.0.3.193
每段数字             相对应的二进制数
10                   00001010
0                    00000000
3                    00000011
193                  11000001
组合起来即为：00001010 00000000 00000011 11000001,转换为10进制数就是：167773121，即该IP地址转换后的数字就是它了。
的每段可以看成是一个0-255的整数，需要对IP地址进行校验

输入描述:
输入
1 输入IP地址
2 输入10进制型的IP地址

输出描述:
输出
1 输出转换成10进制的IP地址
2 输出转换后的IP地址
*/

import java.util.Scanner;
public class IPtoInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String ip = scanner.nextLine();
            String ip10 = scanner.nextLine();
            System.out.println(covertoint(ip));
            System.out.println(covertoIP(ip10));
        }
    }

    //将ip地址转换成数字形式
    public static long covertoint(String ip) {
        String ips[] = ip.split("\\.");
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < ips.length; i++) {
            stringBuffer.append(bin(ips[i]));
        }
        return Long.parseLong(stringBuffer.toString(), 2);
    }

    public static String bin(String s) {  //将分割后的每一个数转换成二进制数
        StringBuffer stringBuffer = new StringBuffer();
        int num = Integer.parseInt(s);
        int k = 1 << 7;
        for (int i = 0; i < 8; i++) {
            int flag = (num & k) == 0 ? 0 : 1;
            stringBuffer.append(flag);
            num = num << 1;
        }
        return stringBuffer.toString();
    }

    //将数字转换成IP地址
    public static String covertoIP(String ip10) {
        StringBuffer stringBuffer = new StringBuffer();
        //将数字形式ip转换为二进制字符串
        String ip2 = Long.toBinaryString(Long.parseLong(ip10));
        String as = "";
        if (ip2.length() < 32) {
            for (int i = 0; i < 32 - ip2.length(); i++) {
                as += "0";
            }
        }
        ip2 = as + ip2;
        String[] ip = new String[4];
        ip[0] = ip2.substring(0, 8);
        ip[1] = ip2.substring(8, 16);
        ip[2] = ip2.substring(16, 24);
        ip[3] = ip2.substring(24);
        for (int i = 0; i < 4; i++) {
            stringBuffer.append(Integer
                    .parseInt(ip[i], 2));
            if (i != 3) {
                stringBuffer.append(".");
            }

        }
        return stringBuffer.toString();
    }
}
