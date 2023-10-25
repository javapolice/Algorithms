package com.programers.easy.day24;

import java.util.stream.Collectors;

public class Exam04 {
    public static void main(String[] args) {
        String myString = "abcdevwxyz";
        String result = solution(myString);
        System.out.println(result);
    }

    public static String solution(String myString) {
        return myString.chars().mapToObj(c -> c < 'l' ? "l" : Character.toString(c)).collect(Collectors.joining());
    }
}
