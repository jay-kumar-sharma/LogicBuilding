package com.basic;

public class Fibonacci {

    static  void fib(int  n){
        int n1=0,n2=1,sum=0;
        if(n==1)
            System.out.println(n1);
        if(n==2)
            System.out.println(n2);

        for(int i=3;i<=n;i++){
            sum=n1+n2;
            n1=n2;
            n2=sum;
        }
        System.out.println(sum);

    }

    static void fibSequence(int n){

        int n1=0,n2=1,sum;
        if(n>=1)
            System.out.print(n1+" ");
        if(n>=2)
            System.out.print(n2+" ");

        for(int i=3;i<=n;i++){
            sum=n1+n2;

            n1=n2;
            n2=sum;
            System.out.print(sum+" ");

        }
    }
}
