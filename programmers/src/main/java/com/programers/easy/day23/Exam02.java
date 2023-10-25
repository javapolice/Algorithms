package com.programers.easy.day23;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Exam02 {
    public static void main(String[] args) {
        String[] str_list = {"abc", "def", "ghi"};
        String ex = "ef";

        String result = solution(str_list, ex);
        System.out.println(result);
    }

    public static String solution(String[] str_list, String ex) {
        return Arrays.stream(str_list).filter(s -> !s.contains(ex)).collect(Collectors.joining());
    }
}
