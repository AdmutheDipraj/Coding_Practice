package com.coadingQ;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String str1="Care";
        String str2="Race";

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()!=str2.length()){
            System.out.println("The given String is Not a Anagram");
        }else{

            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            boolean result = Arrays.equals(ch1, ch2);
            if(result){
                System.out.println("The given Word is Anagram");
            }else {
                System.out.println("The Given Word is Not an Anagram");
            }

        }
    }
}
