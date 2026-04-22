package com.number;

public class ArmStrong {

    public static void checkArmStrong(int num){

        if (num < 0) {
            System.out.println("Not an Armstrong Number");
            return;
        }
        if (num == 0) {
            System.out.println("Armstrong Number: 0");
            return;
        }
        int original=num ,sum=0,count=0;

        while(num!=0){
            num/=10;
            count++;
        }
        num=original;
        while(num!=0){
            int rem=num%10;
           sum=sum+(int) Math.pow(rem,count);
            num/=10;
        }
        if(sum==original)
            System.out.println("ArmStrong Number "+sum);
        else{
            System.out.println("Not ArmStrong Number "+sum);
        }
    }
}
