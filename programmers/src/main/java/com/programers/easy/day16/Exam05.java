package com.programers.easy.day16;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Exam05 {
    public static void main(String[] args) {
        String my_string = "programmers";
        String alp = "p";
        String result = solution(my_string, alp);
        System.out.println(result);
    }

    public static String solution(String my_string, String alp) {
        String answer = Arrays.stream(my_string.split("")).map(s -> {
            if (s.equals(alp)) {
                return s.toUpperCase();
            } else {
                return s;
            }
        }).collect(Collectors.joining());
        return answer;
    }
}
