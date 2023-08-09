package com.programers.easy.day10;

public class Exam01 {
    public static void main(String[] args) {
        String my_string = "ProgrammerS123";
        int n = 11;

        String result = solution(my_string, n);
        System.out.println(result);

    }

    public static String solution(String my_string, int n) {
        String answer = "";
        String s = my_string.substring(0, n);
        answer = s;

        return answer;
    }
}
