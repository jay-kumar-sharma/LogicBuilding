package com.number;

public class HarshadNumber {

    public static void checkHarshadNumber(int num){

        if (num == 0) {
            System.out.println("Not Harshad Number " + num);
            return;
        }
        num = Math.abs(num);
        
        int digitSum=digitSum(num);
        if(num%digitSum==0)
            System.out.println("Harshad Number "+num);
        else
            System.out.println("Not Harshad Number "+num);
    }
    public static int digitSum(int num){

        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        return  sum;
    }
}
