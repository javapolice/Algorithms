package com.programers.easy.day18;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Exam04 {
    public static void main(String[] args) {
        String myString = "ABBAA";
        String pat = "AABB";
        int result = solution(myString, pat);
        System.out.println(result);
    }

    public static int solution(String myString, String pat) {
        String reString = Arrays.stream(myString.split("")).map(s -> s.equals("A") ? "B" : "A").collect(Collectors.joining());
        return reString.contains(pat) ? 1 : 0;
    }
}
