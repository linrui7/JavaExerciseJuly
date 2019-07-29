package com.Kgithub7;
/*
   Author:linrui
   Date:2019/7/29
   Content:
       请编写一个方法，将字符串中的空格全部替换为“%20”。
       假定该字符串有足够的空间存放新增的字符，
       并且知道字符串的真实长度(小于等于1000)，
       同时保证字符串由大小写的英文字母组成。
*/

public class Empty {
    public String replaceSpace(String string,int length){
        if(string==null||string.length()<=0){
            return string;
        }
        //将原来的遍历如果遇到空格就替换
        StringBuffer stringBuffer=new StringBuffer();
        for(int i=0;i<length;i++){
            if(string.charAt(i)==' '){
                stringBuffer.append("%20");
            }else {
                stringBuffer.append(string.charAt(i));
            }
        }
        return stringBuffer.toString();
    }
}
