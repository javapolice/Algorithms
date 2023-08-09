package com.programers.easy.day9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Exam03 {
    public static void main(String[] args) {
        String s = "ProgrammerS123";
        int n = 11;
        String solution = solution(s, n);
        System.out.println(solution);

    }

    public static String solution(String my_string, int n) {
        String answer = "";

        String s = my_string.substring(my_string.length() - n);
        answer = s;

        return answer;
    }
}
