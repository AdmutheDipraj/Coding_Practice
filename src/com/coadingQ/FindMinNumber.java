package com.coadingQ;

public class FindMinNumber {

    public static void main(String[] args) {
        int array[]={2,4,6,8,1,3,5,-7,9};

        int min=1;
        for (int i = 0; i < array.length; i++) {
           min= Math.min(array[i],min);
        }
        System.out.println(min);
    }
}
