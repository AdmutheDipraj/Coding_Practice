package com.coadingQ;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateString {

    //Explain how you would Remove a duplicate character in a string.
    public static void main(String[] args) {
        String str="Programming";
        str=str.toLowerCase();
        char nameArray[]=str.toCharArray();

        Set<Character> duplicateNum=new LinkedHashSet<>();
        for (int i = 0; i < nameArray.length; i++) {
            duplicateNum.add(nameArray[i]);
        }
        System.out.println(duplicateNum);
    }
}
