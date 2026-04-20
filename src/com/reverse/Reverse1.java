package com.reverse;

public class Reverse1 {

    public static void reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
    }
}
