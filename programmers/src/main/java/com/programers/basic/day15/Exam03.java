package com.programers.basic.day15;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Exam03 {
    public static void main(String[] args) {
        String s = "abdc";
        String result = solution(s);
        System.out.println(result);
    }

    public static String solution(String s) {
        String[] strings = s.split("");
        return Arrays.stream(strings)
                .filter(i -> Arrays.stream(strings).filter(j -> j.equals(i)).count() == 1)
                .sorted()
                .collect(Collectors.joining());
    }

}
