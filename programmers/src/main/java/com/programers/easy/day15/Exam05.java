package com.programers.easy.day15;

public class Exam05 {
    public static void main(String[] args) {
        String myString = "aaAA";
        String pat = "aaaaa";
        int result = solution(myString, pat);
        System.out.println(result);
    }

    public static int solution(String myString, String pat) {
        boolean contains = myString.toLowerCase().contains(pat.toLowerCase());
        return contains ? 1 : 0;
    }
}
