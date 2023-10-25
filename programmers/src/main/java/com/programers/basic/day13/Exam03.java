package com.programers.basic.day13;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Exam03 {
    public static void main(String[] args) {
        String s = "We are the world";
        String result = solution2(s);
        System.out.println(result);
    }

    public static String solution(String my_string) {
        String answer = "";
        for (String s : my_string.split("")) {
            if (!answer.contains(s)) answer += s;
        }
        return answer;
    }

    public static String solution2(String my_string) {
        return Arrays.stream(my_string.split("")).distinct().collect(Collectors.joining());
    }
}
