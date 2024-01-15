package com.coadingQ;

public class ReverseString {

    public static void main(String[] args) {
        String str="Sairam";
        char ch[]=str.toCharArray();
        String reverse="";
        for (int i = 0; i < ch.length; i++) {
            reverse=ch[i]+reverse;
        }
        System.out.println(reverse);
    }
}
