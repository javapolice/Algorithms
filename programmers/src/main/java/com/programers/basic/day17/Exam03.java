package com.programers.basic.day17;

import java.util.Arrays;

public class Exam03 {
    public static void main(String[] args) {
        int n = 1234;
        int result = solution(n);
        System.out.println(result);
    }

    public static int solution(int n) {
        return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
    }
}
