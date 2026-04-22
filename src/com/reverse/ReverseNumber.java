package com.reverse;

public class ReverseNumber {

    static void reverse(int n){
        int rev=0;
        while(n!=0){
            int rem=n%10;
            n=n/10;
            rev=rev*10+rem;

        }
        System.out.println(rev);
    }
}
