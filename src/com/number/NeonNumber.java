package com.number;

public class NeonNumber {

    public static void checkNeonNumber(int num){


        if(num<0){
            System.out.println("Not neon number "+num);
            return;
        }
        int original=num;
        long square=square(num);
        long sum=digitSum(square);
        if(original==sum)
            System.out.println("Neon Number "+original);
        else
            System.out.println("Not Neon Number "+original);
    }

    public static  long  square(int num){
        return  (long)num*num;
    }

    public static long digitSum(long num){
        long sum=0;
        while (num!=0){
            sum=sum+num%10;
            num/=10;
        }
        return  sum;
    }
}
