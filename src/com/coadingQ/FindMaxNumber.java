package com.coadingQ;

public class FindMaxNumber {

    public static void main(String[] args) {
        int array[]={2,4,6,8,1,3,5,7};

        int max=-1;
        for (int i = 0; i < array.length; i++) {
            max=Math.max(array[i],max);
        }
        System.out.println(max);
    }
}
