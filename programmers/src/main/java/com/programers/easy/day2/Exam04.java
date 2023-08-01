package com.programers.easy.day2;

public class Exam04 {
    public static void main(String[] args) {
        System.out.println(solution("He11oWor1d","lloWorl",2));

    }

    public static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String s1 = my_string.substring(0, s);
        String s2 = my_string.substring(s + overwrite_string.length());
        answer += s1 + overwrite_string + s2;
        return answer;
    }
}
