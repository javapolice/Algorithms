package com.programers.easy.day18;

public class Exam05 {
    public static void main(String[] args) {
        String rny_string = "programmers";
        String result = solution(rny_string);
        System.out.println(result);
    }

    public static String solution(String rny_string) {
        return rny_string.replace("m","rn");
    }
}
