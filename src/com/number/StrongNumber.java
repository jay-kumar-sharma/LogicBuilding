package com.number;

public class StrongNumber {

    static void checkStrongNumber(int num){
        if(num<0){
            System.out.println("Not Arm Strong Number "+num);
            return;
        }
        int original=num,sum=0;
        while(num!=0){
            int rem=num%10;
            sum=sum+calculatFactorial(rem);
            num/=10;
        }

        if(sum==original)
            System.out.println("Strong Number "+original);
        else
            System.out.println("Not Strong Number "+original);

    }
    static int calculatFactorial(int n){

        if(n==0)
            return 1;

        int factorial=1;
        for(int i=n;i>0;i--){
            factorial=factorial*i;
        }
        return factorial;
    }
}
