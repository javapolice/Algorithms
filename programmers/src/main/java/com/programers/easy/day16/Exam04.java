package com.programers.easy.day16;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Exam04 {
    public static void main(String[] args) {
        String s = "PrOgRaMmErS";
        String result = solution(s);
        System.out.println(result);
    }

    public static String solution(String myString) {
        String answer = Arrays.stream(myString.split("")).map(s -> {
            if (s.equals("a") || s.equals("A")) {
                return s.toUpperCase();
            } else {
                return s.toLowerCase();
            }
        }).collect(Collectors.joining());

        return answer;
    }
}
