package com.reverse;

public class Reverse2 {

    public  static void reverse(String str){

        char[] rev=str.toCharArray();
        int left=0,right=str.length()-1;

        while(left<right){
            char temp=rev[left];
            rev[left]=rev[right];
            rev[right]=temp;
            left++;
            right--;
        }
        System.out.println(new String(rev));

    }
}
