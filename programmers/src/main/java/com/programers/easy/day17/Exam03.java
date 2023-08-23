package com.programers.easy.day17;

import java.util.Arrays;

public class Exam03 {
    public static void main(String[] args) {
        String[] strArr = {"and","notad","abcd"};
        String[] result = solution(strArr);
        for (String s : result) {
            System.out.print(s + " ");
        }
    }
    public static String[] solution(String[] strArr) {
        return Arrays.stream(strArr).filter(s -> !s.contains("ad")).toArray(String[]::new);
    }
}
