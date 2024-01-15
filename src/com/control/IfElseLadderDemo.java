package com.control;

public class IfElseLadderDemo {

    public static void main(String[] args) {
        int cvScore=700;
        if(cvScore>=1000){
            System.out.println("you are applicable for 1 cr loan");
        }else if(cvScore>=900){
            System.out.println("you are applicable for 80 lakh loan");
        }else if(cvScore>=800){
            System.out.println("you are applicable for 60 lakh loan");
        }else if(cvScore>=700){
            System.out.println("you are applicable for 40 lakh loan");
        }else if(cvScore>=600){
            System.out.println("you are applicable for 20 lakh loan");
        }else{
            System.out.println("you are Not applicable for a loan");
        }
    }
}
