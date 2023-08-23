package com.programers.easy.day16;

import java.util.stream.IntStream;

public class Exam03 {
    public static void main(String[] args) {
        String[] sArr = {"AAA","BBB","CCC","DDD"};
        String[] result = solution(sArr);
        for (String s : result) {
            System.out.print(s + " ");
        }
    }

    public static String[] solution(String[] strArr) {
        return IntStream.range(0,strArr.length)
                .mapToObj(i -> (i % 2 == 0)? strArr[i].toLowerCase() : strArr[i].toUpperCase())
                .toArray(String[]::new);
    }
}
