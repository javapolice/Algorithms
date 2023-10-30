package com.programers.basic.day18;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Exam04 {
    public static void main(String[] args) {
        String my_string = "Bcad";
        String result = solution(my_string);
        System.out.println(result);
    }

    public static String solution(String my_string) {
        return Arrays.stream(my_string.toLowerCase().split("")).sorted().collect(Collectors.joining());
    }
}
