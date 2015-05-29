package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;
        Scanner scn=new Scanner(System.in);
        System.out.println("Input natural number: ");
        if(scn.hasNextInt()){
            a=scn.nextInt();
            for(int i=(int)Math.sqrt(a);i>=1;i--){
                if(a%i==0&i!=1){
                    System.out.println("Number is not prime");
                    break;
                }
                if(i==1) System.out.println("Number is prime!");
            }
        }
        else System.out.println("Error. The number is not natural!");
    }
}
