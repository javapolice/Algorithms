package com.programers.easy.day3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Exam02 {
    public static void main(String[] args) {
        String[] arr = {"a","b","c"};
        System.out.println(solution(arr));
    }

    public static String solution(String[] arr) {
        String answer = Arrays.stream(arr).collect(Collectors.joining());
        return answer;
    }
}
