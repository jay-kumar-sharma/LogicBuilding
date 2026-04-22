package com.number;

public class AutomorphicNumber {

    public static  void checkAutomorphicNumber(int num ){

        if(num<0){
            System.out.println("Not Automorphic Number "+num);
            return;
        }

        int digit= digitCount(num);
        long square = (long) num *num;
        int divisior=(int )Math.pow(10,digit);

        if(square%divisior==num)
            System.out.println("Automorphic Number "+num);
        else
            System.out.println(("Not Automorphic Numnber "+num));

    }

    public static int digitCount(int num){
        if(num==0)
            return 1;
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        return  count;
    }
}
