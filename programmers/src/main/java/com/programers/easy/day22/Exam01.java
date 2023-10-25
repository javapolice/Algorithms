package com.programers.easy.day22;

public class Exam01 {
    public static void main(String[] args) {
        String s = "0010";
        String result = solution(s);
        System.out.println(result);
    }

    public static String solution(String n_str) {
        while (n_str.startsWith("0")){
            n_str = n_str.substring(1);
        }
        return n_str;
    }
}
