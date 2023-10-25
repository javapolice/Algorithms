package com.programers.basic.day12;

import java.util.Arrays;

public class Exam03 {
    public static void main(String[] args) {
        String s = "aAb1B2cC34oOp";
        int result = solution(s);
        System.out.print(result);
    }

    public static int solution(String my_string) {
        return Arrays.stream(my_string.replaceAll("\\D", "").split("")).mapToInt(Integer::parseInt).sum();
    }
}
