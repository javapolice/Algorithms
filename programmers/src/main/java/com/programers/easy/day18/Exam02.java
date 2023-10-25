package com.programers.easy.day18;

import java.util.Arrays;

public class Exam02 {
    public static void main(String[] args) {
        String s = "dxccxbbbxaaaa";
        String[] result = solution(s);
        for (String s1 : result) {
            System.out.print(s1 + " ");
        }
    }
    public static String[] solution(String myString) {
        return Arrays.stream(myString.split("x")).filter(s->!s.isBlank()).sorted().toArray(String[]::new);
    }
}
