package com.programers.easy.day17;

import java.util.Arrays;

public class Exam05 {
    public static void main(String[] args) {
        String my_string = " i    love  you";
        String[] result = solution(my_string);
        for (String s : result) {
            System.out.println(s);
        }
    }

    public static String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        String[] array = Arrays.stream(answer).filter(s -> !s.isBlank()).toArray(String[]::new);
        return array;
    }
}
