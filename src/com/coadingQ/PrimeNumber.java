package com.coadingQ;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number");
        int number=scanner.nextInt();
        checkNumber(number);
    }
    public static void checkNumber(int num){
        int count=0;
        for (int i = 2; i < num; i++) {

            if (num%i==0){
                count++;
            }

        }
        if (count==0){

            System.out.println("The Give Number is Prime Number");
        }else {
            System.out.println("The Given Number is Not a Prime Number");
        }

    }
}
