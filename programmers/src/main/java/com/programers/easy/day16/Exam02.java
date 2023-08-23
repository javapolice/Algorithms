package com.programers.easy.day16;

public class Exam02 {
    public static void main(String[] args) {
        String myString = "aBcDeFg";
        String result = solution(myString);
        System.out.print(result);
    }

    public static String solution(String myString) {
        return myString.toLowerCase();
    }

}
