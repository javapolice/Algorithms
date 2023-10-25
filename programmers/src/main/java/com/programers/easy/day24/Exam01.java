package com.programers.easy.day24;

import java.util.Arrays;

public class Exam01 {
    public static void main(String[] args) {
        String[] order = {"cafelatte", "americanoice", "hotcafelatte", "anything"};
        int result = solution(order);
        System.out.println(result);
    }
    public static int solution(String[] order) {
        return Arrays.stream(order).mapToInt(s -> s.contains("cafelatte") ? 5000 : 4500).sum();
    }
}
