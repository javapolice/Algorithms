package com.programers.basic.day14;

import java.util.stream.IntStream;

public class Exam03 {
    public static void main(String[] args) {
        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;
        String result = solution(cipher, code);
        System.out.println(result);
    }

    public static String solution(String cipher, int code) {
        String answer = "";
        String[] strings = cipher.split("");
        for (int i = 0; i < strings.length; i++) {
            if((i+1) % code == 0) {
                answer += strings[i];
            }
        }
        return answer;
    }
}
