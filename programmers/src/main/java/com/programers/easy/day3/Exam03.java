package com.programers.easy.day3;

public class Exam03 {
    public static void main(String[] args) {
        System.out.println(solution("string",3));
    }

    public static String solution(String my_string, int k) {
        String answer = "";
        for (int i = 0; i < k; i++) {
            answer += my_string;
        }
        return answer;
    }
}
