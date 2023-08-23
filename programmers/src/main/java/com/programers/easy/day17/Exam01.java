package com.programers.easy.day17;

public class Exam01 {
    public static void main(String[] args) {
        String myString = "AbCdEFG";
        String pat = "dE";

        String result = solution(myString, pat);
        System.out.println(result);
    }

    public static String solution(String myString, String pat) {
        String s = myString.substring(0, myString.lastIndexOf(pat));
        return s.concat(pat);
    }
}
