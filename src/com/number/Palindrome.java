package com.number;

public class Palindrome {

    public  static void  checkPalindrome(int num){
        int original=num;
        int rev=0;
        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(original==rev)
            System.out.println("Palindrome");
        else{
            System.out.println("Not Palindrome ");
        }
    }
}
