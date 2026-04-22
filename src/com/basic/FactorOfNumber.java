package com.basic;

public class FactorOfNumber {

    static void factor(int n){


        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
                if(i != n / i){
                    System.out.print(n / i + " ");
                }
            }

        }
    }
}
