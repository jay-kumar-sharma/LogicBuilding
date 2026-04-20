package com.reverse;

public class Reverse {

    public  static void  reverse(String str){

        StringBuilder sb= new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
