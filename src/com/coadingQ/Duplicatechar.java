package com.coadingQ;

import java.util.LinkedHashMap;
import java.util.Map;

public class Duplicatechar {

    public static void main(String[] args) {
        String str="Programming";
        str=str.toLowerCase();
       char nameArray[]= str.toCharArray();
        Map<Character,Integer> map=new LinkedHashMap<>();
        for (int i = 0; i < nameArray.length; i++) {
           if (map.containsKey(nameArray[i])){
               map.put(nameArray[i],map.get(nameArray[i])+1);
           }else {
               map.put(nameArray[i],1);
           }
        }
        for (Map.Entry<Character,Integer> entry: map.entrySet()) {
            if (entry.getValue()>1){
                System.out.println(entry.getKey()+":"+entry.getValue());
            }
        }
    }
}
