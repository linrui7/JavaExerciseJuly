package com.Fgithub7;
/*
   Author:linrui
   Date:2019/7/7
   Content:
*/

import java.util.Scanner;

public class ReserveEng {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = scanner.nextLine();
            reserve(str);
        }
    }

    public static void reserve(String str) {
        if (str.length() > 1) {
            String[] strings = str.split(" ");
            int i;
            for (i = strings.length - 1; i > 0; i--) {
                System.out.print(strings[i] + " ");
            }
            System.out.println(strings[0]);
        }else {
            System.out.println(str);
        }
    }
}
