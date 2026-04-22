package com.number;

public class HalfReverse {

    public static void checkHalfReverse(int num){

        int rev=0;
        while(num>rev){
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;

        }
        System.out.println(rev);
    }
}
