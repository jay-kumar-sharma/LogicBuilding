package com.number;

public class PerfectNumber {

    public static void checkPerfect(int num){

        int sum=1,original=num;

        if (num <= 1) {
            System.out.println("Not perfect number " + num);
            return;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;

                if (i != num / i) {
                    sum += num / i;
                }
            }
        }

        if(sum==original)
            System.out.println("Perfect number "+original);
        else
            System.out.println("Not perfect number "+original);
    }
}
