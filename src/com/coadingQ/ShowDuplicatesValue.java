package com.coadingQ;

import java.util.LinkedHashSet;
import java.util.Set;

public class ShowDuplicatesValue {

    public static void main(String[] args) {
        String str="Programming";
        str=str.toLowerCase();
        char[] nameArray = str.toCharArray();
        Set<Character> input=new LinkedHashSet<>();
        Set<Character> duplicates=new LinkedHashSet<>();

        for (char c:nameArray) {
         if(!input.add(c)){
             duplicates.add(c);
         }
        }

        System.out.println(duplicates);
    }
}
