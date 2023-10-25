package com.programers.easy.day21;

import java.util.Arrays;

public class Exam04 {
    public static void main(String[] args) {
        String num_str = "123456789";
        int result = solution(num_str);
        System.out.println(result);
    }

    public static int solution(String num_str) {
        return Arrays.stream(num_str.split("")).mapToInt(Integer::parseInt).sum();
    }
}
