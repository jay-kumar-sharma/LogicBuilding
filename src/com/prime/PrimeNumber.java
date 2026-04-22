package com.prime;

import java.util.Scanner;

public class PrimeNumber {

    public static void checkPrimeNumber(int n){

       if(n<=1){
           System.out.println("Not prime no");
           return ;
       }
       for(int i=2;i<=Math.sqrt(n);i++){
           if(n%i==0){
               System.out.println("Not Prime no");
               return;
           }
       }
       System.out.println("Prime no");
    }



    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        PrimeNumber.checkPrimeNumber(n);



    }
}
